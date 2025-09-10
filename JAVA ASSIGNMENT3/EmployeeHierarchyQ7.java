/* 7. Employee Hierarchy 
Scenario: A company has regular and contractual employees with different pay structures. 
Problem Statement: 
Create a superclass Employee with name and basicSalary. Subclass RegularEmployee adds HRA 10%, 
Subclass ContractEmployee adds allowance 5%. Display net salary. 
Classes/Fields: 
● Employee → name, basicSalary 
● RegularEmployee → HRA 10% 
● ContractEmployee → allowance 5% 
Sample Input: 
Regular → name=Rahul, basicSalary=20000 
Contract → name=Riya, basicSalary=15000 
Sample Output: 
Rahul Net Salary = 22000 
Riya Net Salary = 15750
*/

//Abstract superclass
abstract class Employee{
	  String name;
	  double basicSalary;
	  
	  //constructor
	  Employee(String name, double basicSalary){
		  this.name = name;
		this.basicSalary = basicSalary;
	  }
		  abstract double calculateNetSalary();
}

// subclass 1 RegularEmployee
class RegularEmployee extends Employee{
	RegularEmployee(String name, double basicSalary){
		super(name, basicSalary);
	}
	
	 
	@Override
	double calculateNetSalary(){
		return super.basicSalary + (0.10 * basicSalary);
	}
}

//subclass 2 ContractEmployee
class ContractEmployee extends Employee{
   ContractEmployee(String name, double basicSalary){
		super(name,basicSalary);
	}
	
	@Override
	double calculateNetSalary(){
		return basicSalary + (0.05 * basicSalary);
	}
	public class EmployeeHierarchyQ7{
		public static void main(String[] args){
			Employee e1 = new RegularEmployee("Rahul",20000);
			Employee e2 = new ContractEmployee("Riya",15000);
			
			System.out.println(e1.name + "net salary" + e1.calculateNetSalary());
			System.out.println(e2.name + "net salary" + e2.calculateNetSalary());
		}
	}
}
		
	
	
	
	