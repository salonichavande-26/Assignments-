/*Problem 1: Student Names Management System 
Use Case: A school administrator needs to maintain a list of student names for a class roster. 
Requirements: 
● Add student names to the roster 
● Display all students 
● Remove a student from the roster 
Sample Input: 
Add students: "Amit", "Priya", "Rohan" 
Remove student: "Priya" 
Expected Output: 
Students: Amit, Rohan*/

import java.util.ArrayList;
import java.util.List;

public class Q1Assign{
	public static void main(String[] args){
		ArrayList<String> students = new ArrayList<>();
		
		students.add("Amit");
		students.add("Priya");
		students.add("Rohan");
		
		System.out.println("Current Student: " + students);
		
		students.remove("Priya");
		System.out.println("Student after removal: " + students);
	}
}	
	 