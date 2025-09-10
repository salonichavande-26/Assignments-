/*27. Shape Area Calculator  
Scenario: A drawing application needs to calculate area for different shapes: Circle, Rectangle, and 
Square. 
Problem Statement: 
● Interface Shape → method calculateArea() 
● Classes Circle, Rectangle, Square implement Shape → provide specific area calculation 
● In main(), create objects of each shape, input dimensions, display calculated area 
Sample Input: 
Circle → radius=5 
Rectangle → length=10, breadth=5 
Square → side=4 
Sample Output: 
Circle Area = 78.5 
Rectangle Area = 50 
Square Area = 16 
*/
interface Shape{
	double calculateArea();
}
class Circle implements Shape{
	int radius;
	
	Circle(int radius){
		this.radius = radius;
	}
	
	@Override
	public double calculateArea(){
		return 3.14 * radius * radius;
	}
}
class Rectangle implements Shape{
	int length, breadth;
	Rectangle(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	@Override
	public double calculateArea(){
		 return length * breadth;
	}
}
	

class Square implements Shape{
	int side;
	Square(int side){
		this.side = side;
	}
	@Override
	public double calculateArea(){
		return side * side;
	}
}
public class ShapeAreaCalculatorQ27{
	public static void main(String[] args){
		Circle c = new Circle(5);
		Rectangle r = new Rectangle(10, 5);
		Square s = new Square(4);
		
		System.out.println("Radius is :" + c.calculateArea());
		System.out.println("Area of rectangle is :" + r.calculateArea());
		System.out.println("Area of square is :" + s.calculateArea());
	}
}
		
		
		
	
	
