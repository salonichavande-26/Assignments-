/*Problem 13: Student Registration Order Tracker 
Use Case: Maintain the order in which students registered for a course. 
Requirements: 
● Record registration order 
● Map student names to roll numbers 
● Preserve insertion order 
Sample Input: 
Registrations: "Amit" → 101, "Rohan" → 102, "Priya" → 103 
Expected Output: 
Registration Order: Amit:101, Rohan:102, Priya:103*/

import java.util.LinkedHashMap;
import java.util.Map;

class Q13Assign{
       public static void main(String[] args){
	   
	   Map<String, Integer> registration = new LinkedHashMap<>();
	   
	   registration.put("Amit", 101);
	   registration.put("Rohan", 102);
	   registration.put("Priya", 103);
	   
	   System.out.println("Registration : ");
	   for(Map.Entry<String, Integer> entry: registration.entrySet()){
	       System.out.println("Name: " + entry.getKey() + ", Roll No: " + entry.getValue());
		   }
		   }
		   }
	   