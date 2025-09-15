/*Problem 12: Attendance Tracking System 
Use Case: Track student attendance percentages in alphabetical order. 
Requirements: 
● Map student names to attendance percentages 
● Maintain alphabetical order of students 
● Display sorted attendance report 
Sample Input: 
Attendance: "Amit" → 90, "Rohan" → 85, "Priya" → 95 
Expected Output: 
Attendance Report: Amit:90, Priya:95, Rohan:85*/

import java.util.TreeMap;
import java.util.Map;

class Q12Assign{
       public static void main(String[] args){
	   Map<String, Integer> attendance = new TreeMap<>(); 
	   
	   attendance.put("Amit", 90);
	   attendance.put("Priya", 85);
	   attendance.put("Rohan", 95);
	   
	   System.out.println("Attendance Report: ");
       for(Map.Entry<String, Integer> entry : attendance.entrySet()){
           System.out.println(entry.getKey() + ":" + entry.getValue());
        }		   
	   }
}
