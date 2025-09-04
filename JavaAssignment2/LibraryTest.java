/*Problem 17: Library Book Addition 
Scenario: 
Create Book class with bookId, title, author. 
● Constructor + Getters/Setters 
● Create Library class with libraryName and static totalBooks 
● Method addBook(Book b) → increments totalBooks 
● Method displayTotalBooks() → prints totalBooks 
● Add 2 books to library and display total books
*/
// Book class
class Book {
    int bookId;
    String title;
    String author;

    // Constructor
    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    // Getters
    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Setters
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

// Library class
class Library {
    String libraryName;
    static int totalBooks = 0;

    // Constructor
    Library(String libraryName) {
        this.libraryName = libraryName;
    }

    // Method to add book
    public void addBook(Book b) {
        totalBooks++;
        System.out.println("Book Added → " + b.getTitle() + " by " + b.getAuthor());
    }

    // Method to display total books
    public void displayTotalBooks() {
        System.out.println("Total Books in Library: " + totalBooks);
    }
}

// Main class
class LibraryTest {
    public static void main(String[] args) {
        Library lib = new Library("City Library");

        Book b1 = new Book(101, "Java Programming", "James Gosling");
        Book b2 = new Book(102, "Python Basics", "Guido van Rossum");

        lib.addBook(b1);
        lib.addBook(b2);

        lib.displayTotalBooks();
    }
}
