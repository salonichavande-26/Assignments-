/*13. Shape Drawing 
Scenario: A graphics program needs to draw different shapes. 
Problem Statement: 
Create an abstract class Shape with abstract method draw(). Subclass Circle and Rectangle implement 
draw(). 
Classes/Fields: 
● Shape → draw() (abstract) 
● Circle → radius 
● Rectangle → length, breadth 
Sample Input: 
Circle → radius=7 
Rectangle → length=5, breadth=10 
Sample Output: 
Drawing Circle of radius 7 
Drawing Rectangle of length 5 and breadth 10
*/
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

	
	
