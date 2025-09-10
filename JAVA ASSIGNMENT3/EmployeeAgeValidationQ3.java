/*
3. Employee Age Validation 
Scenario: HR wants to ensure employees entered in the system are adults. 
Problem Statement: 
Create a class Employee with private age. Provide getter/setter. Setter should reject age < 18. 
Fields: 
● private int age 
Methods: 
● setAge(int age) → if age >=18, set; else show error 
● getAge() → returns age 
Sample Input: 
age = 17 
Sample Output: 
“Invalid age” 
*/
class Employee{
	private int age; //private field (cannot be accessed directly outside)
	private String name;
	
	
	Employee(){
		this.name = "Kiran";
	}
	 
	
	// Setter methods
	public void setName(String name){
		this.name = name;
	}
	

      void setAge(int age){
		  if (age >= 18 ){
			  this.age = age;
		  }
		  else{
			  System.out.println("Invalid age");
		  }
	  }
		  //Getter Methods
	 String getName(){
		return name;
	}
	
	 int getAge(){
		return age;
	}
		  
	  
}



public class EmployeeAgeValidationQ3{
public static void main(String args[]){ 
	Employee e1 = new Employee();
	e1.setName("purva");
	e1.setAge(17);
	
	System.out.println("Emp Name = " + e1.getName() + ", Emp Age =" + e1.getAge());
	
	Employee e2 = new Employee();
	e2.setName("Saloni");
	e2.setAge(22);
	
	System.out.println("Emp Name = " + e2.getName() + ", Emp Age=" + e2.getAge());
}
}

	
	
			
			
		
	