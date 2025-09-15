import java.util.*;
import java.util.Map;
import java.util.HashMap;

class Q16Assign{
     public static void main(String[] args){
	 
	 Map<String, Integer> grades = new HashMap<>();
	 
	 grades.put("Amit" , 85);
	 grades.put("Priya", 52);
	 grades.put("Rohan", 78);
	 
	 grades.values().removeIf(marks -> marks < 60);
	 System.out.println("Honor Roll: " + grades);
	 }
	 }