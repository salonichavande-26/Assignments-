/*
15. Shape Area Calculation  
Scenario: A program needs to calculate the area of different shapes using the same method name but 
different parameters. 
Problem Statement: 
Create a class ShapeArea with overloaded methods calculateArea(). 
Methods: 
● calculateArea(int side) → calculates area of square 
● calculateArea(int length, int breadth) → calculates area of rectangle 
● calculateArea(double radius) → calculates area of circle 
Sample Input: 
Square → side=5 
Rectangle → length=4, breadth=6 
Circle → radius=3 
Sample Output: 
Square Area = 25 
Rectangle Area = 24 
Circle Area = 28.26 
*/
class ShapeArea {

    // Overloaded method: Area of Square
    double calculateArea(int side) {
        return side * side;
    }

    // Overloaded method: Area of Rectangle
    double calculateArea(int length, int breadth) {
        return length * breadth;
    }

    // Overloaded method: Area of Circle
    double calculateArea(double radius) {
        return 3.14 * radius * radius;
    }
}

// Test class
public class ShapeAreaQ15 {
    public static void main(String[] args) {
        ShapeArea sa = new ShapeArea();

        System.out.println("Square Area = " + sa.calculateArea(5));
        System.out.println("Rectangle Area = " + sa.calculateArea(4, 6));
        System.out.println("Circle Area = " + sa.calculateArea(3.0));
    }
}
