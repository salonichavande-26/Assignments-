/*17. Vehicle Speed Display  
Scenario: Vehicle management system needs to display speed differently for different vehicle types. 
Problem Statement: 
Create class Vehicle with method displaySpeed(). Subclass Car and Bike override it. 
Classes/Fields: 
● Vehicle → displaySpeed() prints “Vehicle speed unknown” 
● Car → overrides displaySpeed() → “Car speed 120 km/h” 
● Bike → overrides displaySpeed() → “Bike speed 80 km/h” 
Sample Input: 
Car 
Bike 
Sample Output: 
Car speed 120 km/h 
Bike speed 80 km/h */

// Base class
class Vehicle {
    void displaySpeed() {
        System.out.println("Vehicle speed unknown");
    }
}

// Subclass Car
class Car extends Vehicle {
    @Override
    void displaySpeed() {
        System.out.println("Car speed 120 km/h");
    }
}

// Subclass Bike
class Bike extends Vehicle {
    @Override
    void displaySpeed() {
        System.out.println("Bike speed 80 km/h");
    }
}

// Test class
public class VehicleSpeedDisplayQ17 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();   // Polymorphism
        Vehicle v2 = new Bike();  // Polymorphism

        v1.displaySpeed();  // Car’s version
        v2.displaySpeed();  // Bike’s version
    }
}
