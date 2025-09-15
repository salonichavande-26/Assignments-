/*Problem 11: Student Grade Management 
Use Case: A teacher needs to map student names to their exam marks. 
Requirements: 
● Store student name and marks pairs 
● Retrieve marks by student name 
● Display all student-marks mappings 
Sample Input: 
Students and marks: "Amit" → 85, "Priya" → 92, "Rohan" → 78 
Expected Output: 
Grade Report: Amit:85, Priya:92, Rohan:78 
*/

import java.util.HashMap;
import java.util.Map;

class Q11Assign{
        public static void main(String[] args){
		
		Map<String, Integer> report = new HashMap<>();
		
		report.put("Amit", 85);
		report.put("Priya", 92);
		report.put("Rohan", 78);
		
		String student = "Priya";
		System.out.println(student + "marks: " + report.get(student));
		
		System.out.println("Grade Report: ");
		for(Map.Entry<String, Integer> entry : report.entrySet()){
		System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}