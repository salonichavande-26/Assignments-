/*
8. Vehicle Types 
Scenario: You want to categorize vehicles. 
Problem Statement: 
Create a superclass Vehicle with brand, speed. Create subclasses Car and Bike with additional modelType. 
Display details of each vehicle. 
Classes/Fields: 
● Vehicle → brand, speed 
● Car → modelType 
● Bike → modelType 
Sample Input: 
Car → brand=Honda, speed=180, modelType=Civic 
Bike → brand=Yamaha, speed=120, modelType=R15 
Sample Output: 
Car → Honda Civic, Speed=180 
Bike → Yamaha R15, Speed=120
*/

class Vehicle{
	String brand;
	int speed;
	
	Vehicle(String brand,int speed){
		this.brand = name;
		this.speed = speed;
	}
}
class car extends Vehicle{
	String modelType;
	
	Car(String brand, int speed, modelType){
		super(brand, speed);
		this.modelType = modelType;
	}
	
	void showDetails(){
		System.out.println("Bike → " + brand + " " + modelType + ", Speed=" + speed);
	}
}

public class VehiclTypeQ8{
	public static void main(String[] args){
		Car c = new Car("Honda", 180, "Civic");
		Bike b = new Bike("Yamaha", 120, "RIS");
		
		c.showDetails();
		b.showDetails();
	}
}
	
	
	
	
	
		
