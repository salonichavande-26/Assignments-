/*Problem 7: Alphabetical Student Directory 
Use Case: A school wants to maintain student names in alphabetical order. 
Requirements: 
● Add student names 
● Automatically maintain alphabetical sorting 
● Display sorted name 
Sample Input: 
Students: "Rohan", "Amit", "Priya" 
Expected Output: 
Students: Amit, Priya, Rohan */

import java.util.TreeSet;
import java.util.Set;

class Q7Assign{
	public static void main(String[] args){
	Set<String> names = new TreeSet<>();
	
	names.add("Rohan");
	names.add("Amit");
	names.add("Priya");
	
	System.out.println("Name: " + names);
	}
}

	
	