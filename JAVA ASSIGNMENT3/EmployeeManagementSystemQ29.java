/*
29. Employee Management System 
Scenario: Manage employee details, calculate salaries, and differentiate employee types. 
Problem Statement: 
● Abstract Class Employee → instance variables: name, id 
○ Abstract method calculateSalary() → different calculation for each type 
● Class PermanentEmployee extends Employee → include basicSalary and hra → implement 
calculateSalary() 
● Class ContractEmployee extends Employee → include hourlyRate and hoursWorked → 
implement calculateSalary() 
● Interface BonusEligible → method calculateBonus() → applies only to permanent employees 
● In main(), create 2 permanent and 2 contract employees, display salary + bonus if eligible 
Sample Input: 
PermanentEmployee → name="Amit", basicSalary=50000, hra=5000 
ContractEmployee → name="Neha", hourlyRate=300, hoursWorked=100 
Sample Output: 
Amit Salary = 55000, Bonus = 5500 
Neha Salary = 30000 
30. Library Management System 
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
Notification sent to Prof. Singh: Return books within 14 days 
C-DAC
*/
// Interface for bonus eligibility
interface BonusEligible {
    double calculateBonus();
}

// Abstract class Employee
abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method
    abstract double calculateSalary();
}

// PermanentEmployee class
class PermanentEmployee extends Employee implements BonusEligible {
    double basicSalary;
    double hra;

    PermanentEmployee(String name, int id, double basicSalary, double hra) {
        super(name, id);
        this.basicSalary = basicSalary;
        this.hra = hra;
    }

    @Override
    double calculateSalary() {
        return basicSalary + hra;
    }

    @Override
    public double calculateBonus() {
        return 0.10 * calculateSalary(); // Bonus = 10% of salary
    }
}

// ContractEmployee class
class ContractEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    ContractEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

// Test Class
public class EmployeeManagementSystemQ29 {
    public static void main(String[] args) {
        // Create Permanent Employees
        PermanentEmployee p1 = new PermanentEmployee("Amit", 101, 50000, 5000);
        PermanentEmployee p2 = new PermanentEmployee("Riya", 102, 40000, 4000);

        // Create Contract Employees
        ContractEmployee c1 = new ContractEmployee("Neha", 201, 300, 100);
        ContractEmployee c2 = new ContractEmployee("Karan", 202, 250, 120);

        // Display details
        System.out.println(p1.name + " Salary = " + p1.calculateSalary() + ", Bonus = " + p1.calculateBonus());
        System.out.println(p2.name + " Salary = " + p2.calculateSalary() + ", Bonus = " + p2.calculateBonus());

        System.out.println(c1.name + " Salary = " + c1.calculateSalary());
        System.out.println(c2.name + " Salary = " + c2.calculateSalary());
    }
}
