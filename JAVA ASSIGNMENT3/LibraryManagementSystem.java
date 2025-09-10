/*30. Library Management System 
Scenario: Manage books and library members with borrowing functionality. 
Problem Statement: 
● Class Book → private variables: bookId, title, author (Encapsulation) 
● Abstract Class LibraryMember → instance variables: memberId, name 
○ Abstract method borrowBook(Book book) 
● Class StudentMember extends LibraryMember → limit 3 books 
● Class FacultyMember extends LibraryMember → limit 5 books 
● Interface Notifyable → method sendNotification(String message) → notify members about 
overdue books 
● In main(), create 1 student and 1 faculty, borrow books, send notifications 
Sample Input: 
Student → borrow 2 books 
Faculty → borrow 4 books 
Sample Output: 
StudentMember Amit borrowed 2 books 
FacultyMember Prof. Singh borrowed 4 books 
Notification sent to Amit: Return books within 7 days 
Notification sent to Prof. Singh: Return books within 14 days*/

// Book class with Encapsulation
class Book {
    private int bookId;
    private String title;
    private String author;

    // Constructor
    public Book(int bookId, String title, String author) {
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
}

// Interface for notification
interface Notifyable {
    void sendNotification(String message);
}

// Abstract class LibraryMember
abstract class LibraryMember implements Notifyable {
    int memberId;
    String name;
    int borrowedBooks;

    LibraryMember(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedBooks = 0;
    }

    // Abstract method
    abstract void borrowBook(Book book);

    // Common method for notifications
    @Override
    public void sendNotification(String message) {
        System.out.println("Notification sent to " + name + ": " + message);
    }
}

// StudentMember with borrowing limit 3
class StudentMember extends LibraryMember {
    static final int BORROW_LIMIT = 3;

    StudentMember(int memberId, String name) {
        super(memberId, name);
    }

    @Override
    void borrowBook(Book book) {
        if (borrowedBooks < BORROW_LIMIT) {
            borrowedBooks++;
        } else {
            System.out.println(name + " cannot borrow more than " + BORROW_LIMIT + " books.");
        }
    }
}

// FacultyMember with borrowing limit 5
class FacultyMember extends LibraryMember {
    static final int BORROW_LIMIT = 5;

    FacultyMember(int memberId, String name) {
        super(memberId, name);
    }

    @Override
    void borrowBook(Book book) {
        if (borrowedBooks < BORROW_LIMIT) {
            borrowedBooks++;
        } else {
            System.out.println(name + " cannot borrow more than " + BORROW_LIMIT + " books.");
        }
    }
}

// Test class
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create books
        Book b1 = new Book(101, "Java Programming", "James Gosling");
        Book b2 = new Book(102, "OOP Concepts", "Grady Booch");
        Book b3 = new Book(103, "Data Structures", "Mark Allen");
        Book b4 = new Book(104, "Algorithms", "Thomas Cormen");

        // Create members
        StudentMember student = new StudentMember(1, "Amit");
        FacultyMember faculty = new FacultyMember(2, "Prof. Singh");

        // Borrow books
        student.borrowBook(b1);
        student.borrowBook(b2);

        faculty.borrowBook(b1);
        faculty.borrowBook(b2);
        faculty.borrowBook(b3);
        faculty.borrowBook(b4);

        // Show borrowing status
        System.out.println("StudentMember " + student.name + " borrowed " + student.borrowedBooks + " books");
        System.out.println("FacultyMember " + faculty.name + " borrowed " + faculty.borrowedBooks + " books");

        // Notifications
        student.sendNotification("Return books within 7 days");
        faculty.sendNotification("Return books within 14 days");
    }
}
