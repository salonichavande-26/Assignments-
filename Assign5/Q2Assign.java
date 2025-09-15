/*Problem 2: Lab Access Queue System 
Use Case: A computer lab needs to manage students waiting for access using a first-come-first-served 
system. 
Requirements: 
● Students join the queue for lab access 
● Process students in FIFO order 
● Display remaining queue 
Sample Input: 
Enqueue: "Amit", "Priya", "Rohan" 
Dequeue: 1 student 
Expected Output: 
Queue: Priya, Rohan */

import java.util.*;

public class Q2Assign{
	public static void main(String[] args){
		Queue<String> students = new LinkedList<>();
		
		students.add("Amit");
		students.add("Priya");
		students.add("Rohan");
		
		students.poll();
		
		System.out.println("Students: ");
		
		
		for(String student : students){
		System.out.println(student + " ");
		}
	}
}