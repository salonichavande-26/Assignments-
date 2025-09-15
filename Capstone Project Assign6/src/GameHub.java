
import java.util.*;

// Game Hub - Java Console Application
// Single-file implementation for the lab assignment

// Custom Exceptions
class GameNotFoundException extends Exception {
    public GameNotFoundException(String msg) { super(msg); }
}
class UserNotFoundException extends Exception {
    public UserNotFoundException(String msg) { super(msg); }
}
class InvalidRatingException extends Exception {
    public InvalidRatingException(String msg) { super(msg); }
}

// Interface for game actions
interface GameActions {
    Game addGame(String name, String genre, int rating, String platform) throws InvalidRatingException;
    boolean removeGame(int gameId) throws GameNotFoundException;
    void viewGames(Comparator<Game> sorter);
    List<Game> searchGame(String keyword);
    boolean registerUser(String username, String email);
    void viewUsers();
    void issueGame(int gameId, String username) throws GameNotFoundException, UserNotFoundException;
    void returnGame(int gameId, String username) throws GameNotFoundException, UserNotFoundException;
    void viewBorrowedQueue();
    void printStats();
}

// Abstract base class
abstract class Game implements Comparable<Game> {
    protected int id;
    protected String name;
    protected String genre;
    protected int rating; // 1-5
    protected String platform; // "Console" or "PC"
    protected String borrowedBy; // username of borrower or null

    public Game() { }

    public Game(int id, String name, String genre, int rating, String platform) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.rating = rating;
        this.platform = platform;
        this.borrowedBy = null;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getGenre() { return genre; }
    public int getRating() { return rating; }
    public String getPlatform() { return platform; }
    public String getBorrowedBy() { return borrowedBy; }
    public void setBorrowedBy(String username) { this.borrowedBy = username; }

    public void setRating(int r) { this.rating = r; }

    public abstract String displayDetails();

    @Override
    public int compareTo(Game o) {
        return Integer.compare(this.id, o.id);
    }

    @Override
    public String toString() {
        return displayDetails();
    }
}

class ConsoleGame extends Game {
    private String consoleType; // e.g., PS5, Xbox, Switch

    public ConsoleGame(int id, String name, String genre, int rating, String consoleType) {
        super(id, name, genre, rating, "Console");
        this.consoleType = consoleType;
    }

    public String getConsoleType() { return consoleType; }

    @Override
    public String displayDetails() {
        return String.format("ID:%d | %s | Genre:%s | Rating:%d | Platform:%s(%s) | BorrowedBy:%s",
                id, name, genre, rating, platform, consoleType, borrowedBy==null?"-":borrowedBy);
    }
}

class PCGame extends Game {
    private String minSpec; // simple field for platform-specific info

    public PCGame(int id, String name, String genre, int rating, String minSpec) {
        super(id, name, genre, rating, "PC");
        this.minSpec = minSpec;
    }

    public String getMinSpec() { return minSpec; }

    @Override
    public String displayDetails() {
        return String.format("ID:%d | %s | Genre:%s | Rating:%d | Platform:%s(%s) | BorrowedBy:%s",
                id, name, genre, rating, platform, minSpec, borrowedBy==null?"-":borrowedBy);
    }
}

class User {
    private String username;
    private String email;
    private List<Integer> borrowedGameIds; // track borrowed games by id

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.borrowedGameIds = new ArrayList<>();
    }

    public String getUsername() { return username; }
    public String getEmail() { return email; }
    public List<Integer> getBorrowedGameIds() { return borrowedGameIds; }

    public void borrowGame(int gameId) { borrowedGameIds.add(gameId); }
    public void returnGame(int gameId) { borrowedGameIds.remove(Integer.valueOf(gameId)); }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User u = (User) o;
        return Objects.equals(username.toLowerCase(), u.username.toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(username.toLowerCase());
    }

    @Override
    public String toString() {
        return String.format("%s (%s) | Borrowed:%s", username, email, borrowedGameIds);
    }
}

// Comparators
class NameComparator implements Comparator<Game> {
    @Override
    public int compare(Game a, Game b) {
        return a.getName().compareToIgnoreCase(b.getName());
    }
}
class RatingComparator implements Comparator<Game> {
    @Override
    public int compare(Game a, Game b) {
        return Integer.compare(b.getRating(), a.getRating()); // descending
    }
}

// Manager
class GameHubManager implements GameActions {
    private List<Game> allGames = new ArrayList<>();
    private LinkedList<Game> borrowedQueue = new LinkedList<>();
    private Set<User> users = new HashSet<>();
    private Map<Integer, Game> gameMap = new HashMap<>();
    private static int totalGames = 0;
    private static int totalUsers = 0;

    // Next ID generator
    private int nextId = 1;

    // synchronized id generation (not strictly needed in single-threaded console app)
    private synchronized int generateId() { return nextId++; }

    @Override
    public Game addGame(String name, String genre, int rating, String platform) throws InvalidRatingException {
        if (rating < 1 || rating > 5) throw new InvalidRatingException("Rating must be between 1 and 5");
        int id = generateId();
        Game g;
        if (platform.equalsIgnoreCase("console")) {
            // For simplicity ask for a console sub-type placeholder - here we default to "GenericConsole"
            g = new ConsoleGame(id, name, genre, rating, "GenericConsole");
        } else {
            g = new PCGame(id, name, genre, rating, "MinSpec: Unknown");
        }
        allGames.add(g);
        gameMap.put(id, g);
        totalGames++;
        return g;
    }

    @Override
    public boolean removeGame(int gameId) throws GameNotFoundException {
        Game g = gameMap.get(gameId);
        if (g == null) throw new GameNotFoundException("Game with ID " + gameId + " not found.");
        if (g.getBorrowedBy() != null) {
            System.out.println("Cannot remove - game is currently borrowed by: " + g.getBorrowedBy());
            return false;
        }
        allGames.remove(g);
        gameMap.remove(gameId);
        System.out.println("Removed game: " + g.getName());
        return true;
    }

    @Override
    public void viewGames(Comparator<Game> sorter) {
        List<Game> copy = new ArrayList<>(allGames);
        if (sorter != null) Collections.sort(copy, sorter);
        else Collections.sort(copy); // default ID
        if (copy.isEmpty()) {
            System.out.println("No games in collection.");
            return;
        }
        System.out.println("--- Games ---");
        for (Game g : copy) System.out.println(g.displayDetails());
    }

    @Override
    public List<Game> searchGame(String keyword) {
        String k = keyword.toLowerCase();
        List<Game> res = new ArrayList<>();
        for (Game g : allGames) {
            if (g.getName().toLowerCase().contains(k) || g.getGenre().toLowerCase().contains(k)) res.add(g);
        }
        return res;
    }

    @Override
    public boolean registerUser(String username, String email) {
        User u = new User(username, email);
        if (users.contains(u)) {
            System.out.println("Username already exists: " + username);
            return false;
        }
        users.add(u);
        totalUsers++;
        System.out.println("User registered: " + username);
        return true;
    }

    @Override
    public void viewUsers() {
        if (users.isEmpty()) { System.out.println("No registered users."); return; }
        System.out.println("--- Users ---");
        for (User u : users) System.out.println(u);
    }

    @Override
    public void issueGame(int gameId, String username) throws GameNotFoundException, UserNotFoundException {
        Game g = gameMap.get(gameId);
        if (g == null) throw new GameNotFoundException("Game ID " + gameId + " not found.");
        if (g.getBorrowedBy() != null) {
            System.out.println("Game already borrowed by " + g.getBorrowedBy());
            return;
        }
        User user = findUser(username);
        if (user == null) throw new UserNotFoundException("User not found: " + username);
        // mark borrowed
        g.setBorrowedBy(user.getUsername());
        borrowedQueue.addLast(g);
        user.borrowGame(gameId);
        System.out.println("Game issued successfully to " + user.getUsername());
    }

    @Override
    public void returnGame(int gameId, String username) throws GameNotFoundException, UserNotFoundException {
        Game g = gameMap.get(gameId);
        if (g == null) throw new GameNotFoundException("Game ID " + gameId + " not found.");
        if (g.getBorrowedBy() == null) { System.out.println("Game is not currently borrowed."); return; }
        if (!g.getBorrowedBy().equalsIgnoreCase(username)) {
            System.out.println("Only the borrower (" + g.getBorrowedBy() + ") can return this game.");
            return;
        }
        User user = findUser(username);
        if (user == null) throw new UserNotFoundException("User not found: " + username);
        // return
        g.setBorrowedBy(null);
        borrowedQueue.remove(g);
        user.returnGame(gameId);
        System.out.println("Game returned successfully by " + username);
    }

    @Override
    public void viewBorrowedQueue() {
        if (borrowedQueue.isEmpty()) { System.out.println("No borrowed games."); return; }
        System.out.println("--- Borrowed Queue ---");
        for (Game g : borrowedQueue) System.out.println(g.displayDetails());
    }

    @Override
    public void printStats() {
        long borrowed = allGames.stream().filter(g -> g.getBorrowedBy() != null).count();
        long available = allGames.size() - borrowed;
        System.out.println("--- Collection Statistics ---");
        System.out.println("Total Games: " + allGames.size());
        System.out.println("Available Games: " + available);
        System.out.println("Borrowed Games: " + borrowed);
        System.out.println("Total Registered Users: " + users.size());
    }

    private User findUser(String username) {
        for (User u : users) if (u.getUsername().equalsIgnoreCase(username)) return u;
        return null;
    }
}

// Main application
public class GameHub {
    private static Scanner sc = new Scanner(System.in);
    private static GameHubManager manager = new GameHubManager();

    public static void main(String[] args) {
        seedSampleData();
        System.out.println("Welcome to Game Hub - Game Collection Manager");
        boolean exit = false;
        while (!exit) {
            printMenu();
            String choice = sc.nextLine().trim();
            try {
                switch (choice) {
                    case "1": addGameFlow(); break;
                    case "2": removeGameFlow(); break;
                    case "3": viewGamesFlow(); break;
                    case "4": searchGameFlow(); break;
                    case "5": registerUserFlow(); break;
                    case "6": manager.viewUsers(); break;
                    case "7": issueGameFlow(); break;
                    case "8": returnGameFlow(); break;
                    case "9": manager.viewBorrowedQueue(); break;
                    case "10": manager.printStats(); break;
                    case "0": exit = true; break;
                    default: System.out.println("Invalid choice. Try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        System.out.println("Goodbye!");
    }

    private static void printMenu() {
        System.out.println("\n--- Menu ---");
        System.out.println("1. Add Game");
        System.out.println("2. Remove Game");
        System.out.println("3. View Games (sort options)");
        System.out.println("4. Search Game by Name or Genre");
        System.out.println("5. Register User");
        System.out.println("6. View Users");
        System.out.println("7. Issue (Borrow) Game");
        System.out.println("8. Return Game");
        System.out.println("9. View Borrowed Queue");
        System.out.println("10. Collection & User Stats");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
    }

    private static void addGameFlow() {
        try {
            System.out.print("Name: "); String name = sc.nextLine();
            System.out.print("Genre: "); String genre = sc.nextLine();
            System.out.print("Rating (1-5): "); int rating = Integer.parseInt(sc.nextLine());
            System.out.print("Platform (Console/PC): "); String platform = sc.nextLine();
            Game g = manager.addGame(name, genre, rating, platform);
            System.out.println("Game added successfully. ID: " + g.getId());
        } catch (InvalidRatingException ire) {
            System.out.println("Invalid rating: " + ire.getMessage());
        } catch (NumberFormatException nfe) {
            System.out.println("Please enter a numeric rating.");
        }
    }

    private static void removeGameFlow() {
        try {
            System.out.print("Enter Game ID to remove: "); int id = Integer.parseInt(sc.nextLine());
            manager.removeGame(id);
        } catch (GameNotFoundException gnfe) {
            System.out.println(gnfe.getMessage());
        } catch (NumberFormatException nfe) {
            System.out.println("Please enter a valid numeric ID.");
        }
    }

    private static void viewGamesFlow() {
        System.out.println("Sort by: 1.ID  2.Name  3.Rating");
        System.out.print("Choice: "); String ch = sc.nextLine();
        switch (ch) {
            case "1": manager.viewGames(null); break;
            case "2": manager.viewGames(new NameComparator()); break;
            case "3": manager.viewGames(new RatingComparator()); break;
            default: System.out.println("Invalid sort option.");
        }
    }

    private static void searchGameFlow() {
        System.out.print("Enter name or genre to search: "); String q = sc.nextLine();
        List<Game> res = manager.searchGame(q);
        if (res.isEmpty()) System.out.println("No matches found.");
        else { System.out.println("Matches:"); for (Game g : res) System.out.println(g.displayDetails()); }
    }

    private static void registerUserFlow() {
        System.out.print("Username: "); String uname = sc.nextLine();
        System.out.print("Email: "); String email = sc.nextLine();
        manager.registerUser(uname, email);
    }

    private static void issueGameFlow() {
        try {
            System.out.print("Game ID to issue: "); int id = Integer.parseInt(sc.nextLine());
            System.out.print("Issuing to Username: "); String uname = sc.nextLine();
            manager.issueGame(id, uname);
        } catch (NumberFormatException nfe) {
            System.out.println("Enter valid numeric ID.");
        } catch (GameNotFoundException | UserNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void returnGameFlow() {
        try {
            System.out.print("Game ID to return: "); int id = Integer.parseInt(sc.nextLine());
            System.out.print("Returning by Username: "); String uname = sc.nextLine();
            manager.returnGame(id, uname);
        } catch (NumberFormatException nfe) {
            System.out.println("Enter valid numeric ID.");
        } catch (GameNotFoundException | UserNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    // Seed some sample data for quick testing
    private static void seedSampleData() {
        try {
            manager.addGame("God of War", "Action", 5, "Console");
            manager.addGame("Stardew Valley", "Simulation", 4, "PC");
            manager.addGame("FIFA 23", "Sports", 4, "Console");
            manager.registerUser("alice", "alice@example.com");
            manager.registerUser("bob", "bob@example.com");
        } catch (InvalidRatingException e) {
            // ignore
        }
    }
}
