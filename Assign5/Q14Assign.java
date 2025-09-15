/*Problem 14: Grade Update System 
Use Case: Update a student's marks in the grading system. 
Requirements: 
● Store student grades 
● Update existing student's marks 
● Display updated information 
Sample Input: 
Initial: "Rohan" → 78 
Update: "Rohan" → 88 
Expected Output: 
Updated Grade: Rohan:88 
*/

import java.util.HashMap;
import java.util.Map;

class Q14Assign{
       public static void main(String args[]){
	   Map<String, Integer> marks = new HashMap<>();
	   
	   marks.put("Rohan", 78);
	   
	   System.out.println("Initial Marks: " + marks.get("Rohan"));
	   
	   marks.put("Rohan", 88);
	   
	   System.out.println("Updated Marks: " + marks.get("Rohan"));
	   }
}
	   
	   
	  