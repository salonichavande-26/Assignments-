/*Problem 3: Daily Task Tracker 
Use Case: A student wants to track their daily tasks and mark completed ones. 
Requirements: 
● Add tasks to the list 
● Mark tasks as completed (remove them) 
● Display remaining tasks 
Sample Input: 
Add tasks: "Study Java", "Complete Assignment", "Exercise" 
Complete task: "Exercise" 
Expected Output: 
Remaining tasks: Study Java, Complete Assignment */

import java.util.List;
import java.util.ArrayList;
class Q3Assign{
	public static void main(String[] Args){
		List<String> tasks = new ArrayList<>();
		
		tasks.add("Study  Java");
		tasks.add("Complete Assignment");
		tasks.add("Exercise");
		
		System.out.println("Initial task: ");
		for(String task: tasks){
			System.out.print(task + " ");
		}
		System.out.println();
		
		tasks.remove("Exercise");
		System.out.println("Remaining Tasks: ");
		for(String task: tasks){
			System.out.print(task + " ");
		}
		System.out.println();
	}
}
		