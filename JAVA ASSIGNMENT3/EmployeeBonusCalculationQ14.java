/*
abstract class Shape{
	abstract void draw();
}
// Subclass 1:  
class Circle extends Shape {
    int radius;
   

    Circle(int radius) {
        this.radius =  radius;
        
    }

    @Override
    void draw() {
        System.out.println("Drawing Circle of radius " + radius);
    }
}

// Subclass 2:  
class Rectangle extends Shape {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void draw() {
        System.out.println("Drawing Rectangle of length "+ length + " and breadth " + breadth);
    }
}

// Test Class
public class ShapeDrawingQ13 {
    public static void main(String[] args) {
        Shape c = new Circle(7);
       Shape r = new Rectangle(5, 10);

        c.draw();
        r.draw();
    }
}
*/
// Abstract Class
abstract class Employee {
    String name;
    double salary;

    // Constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Abstract method
    abstract double calculateBonus();
}

// Subclass: Manager
class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return 0.20 * salary; // 20% of salary
    }
}

// Subclass: Developer
class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return 0.10 * salary; // 10% of salary
    }
}

// Test Class
public class EmployeeBonusCalculationQ14 {
    public static void main(String[] args) {
        Employee e1 = new Manager("Anita", 50000);
        Employee e2 = new Developer("Rohit", 40000);

        System.out.println(e1.name + " Bonus = " + e1.calculateBonus());
        System.out.println(e2.name + " Bonus = " + e2.calculateBonus());
    }
}
