/*4. Library Book Availability 
Scenario: A library wants to keep track of available copies without letting external code change it 
directly. 
Problem Statement: 
Create a class Book with private copiesAvailable. Provide getter/setter to update or read copies. 
Fields: 
● private int copiesAvailable 
Methods: 
● addCopies(int n) → add copies 
● removeCopies(int n) → subtract if enough copies 
● getCopiesAvailable() → return current copies 
Sample Input: 
add 3 copies, remove 1 copy 
Sample Output: 
Copies available = 2 
*/

/*
4. Library Book Availability
Scenario: A library wants to keep track of available copies without letting external code change it directly.
Problem Statement:
Create a class Book with private copiesAvailable. Provide getter/setter to update or read copies.
*/

class Book {
    private int copiesAvailable;  // private field

    // Constructor (optional, start with 0 copies)
    Book() {
        copiesAvailable = 0;
    }

    // Getter
    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    // Add copies (Setter style method)
    public void addCopies(int n) {
        if (n > 0) {
            copiesAvailable += n;
            System.out.println(n + " copies added.");
        } else {
            System.out.println("Invalid number of copies to add.");
        }
    }

    // Remove copies (Setter style method with validation)
    public void removeCopies(int n) {
        if (n <= 0) {
            System.out.println("Invalid number of copies to remove.");
        } else if (n > copiesAvailable) {
            System.out.println("Not enough copies available to remove!");
        } else {
            copiesAvailable -= n;
            System.out.println(n + " copies removed.");
        }
    }
}

// Test class
public class LibraryBookAvailabilityQ4 {
    public static void main(String[] args) {
        Book b1 = new Book();

        // Add 3 copies
        b1.addCopies(3);

        // Remove 1 copy
        b1.removeCopies(1);

        // Show available copies using getter
        System.out.println("Copies available = " + b1.getCopiesAvailable());
    }
}
