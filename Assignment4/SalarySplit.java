/*Problem 1: Salary Split 
Scenario: You are developing a payroll system for a company. The HR department wants to distribute a 
bonus equally among employees in a department. However, sometimes a department might have zero 
employees due to restructuring. 
 
Task: Create a method that divides a bonus amount among employees and handles the case when the 
number of employees is zero. 
 
Sample Input: 
10000 
0 
 
Expected Output: 
Error: Division by zero not allowed */

import java.util.Scanner;
public class SalarySplit {
	 public static void divideBonus(int bonus, int employee){
		 try{ 
		             int divide = bonus/employee;
		 }
		 catch(ArithmeticException e){
			 System.out.println("Enter: Division by zero not allowed");
		 }
	 }
	 public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter Bonus Amount: ");
		 int bonus = sc.nextInt();
		 
		 System.out.println("Enter number of Employer: ");
		 int employee = sc.nextInt();
		 
		 divideBonus(bonus, employee);
	 }
}

	
 	
	

