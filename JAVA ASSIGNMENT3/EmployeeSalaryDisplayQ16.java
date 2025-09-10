/*
16. Employee Salary Display 
Scenario: Company wants to display employee salary with different bonus calculations based on 
employee type. 
Problem Statement: 
Create class Employee with method displaySalary(). Subclass Manager and Developer override 
displaySalary() to include bonus. 
Classes/Fields: 
● Employee → name, salary, displaySalary() prints salary 
● Manager → overrides displaySalary() → adds 20% bonus 
● Developer → overrides displaySalary() → adds 10% bonus 
Sample Input: 
Manager → name=Anita, salary=50000 
Developer → name=Rohit, salary=40000 
Sample Output: 
Anita Total Salary = 60000 
Rohit Total Salary = 44000
*/
class Employee{
	String name;
	double salary;
	
	Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
	}
	void displaySalary(){
		System.out.println(name + "Salary = " + salary);
	}
}
class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    void displaySalary() {
        double totalSalary = salary + (0.20 * salary); // 20% bonus
        System.out.println(name + " Total Salary = " + totalSalary);
    }
}

// Subclass Developer
class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    void displaySalary() {
        double totalSalary = salary + (0.10 * salary); // 10% bonus
        System.out.println(name + " Total Salary = " + totalSalary);
    }
}

// Test class
public class EmployeeSalaryDisplayQ16 {
    public static void main(String[] args) {
        Employee e1 = new Manager("Anita", 50000);
        Employee e2 = new Developer("Rohit", 40000);

        e1.displaySalary();
        e2.displaySalary();
    }
}