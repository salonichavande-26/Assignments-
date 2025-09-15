/*Problem 23: Browser History Management 
Use Case: Maintain browser history with back functionality. 
Requirements: 
● Store visited pages 
● Implement back navigation (LIFO) 
● Display current history 
Sample Input: 
Pages visited: "Google", "YouTube", "GFG" 
Action: Back (1 page) 
Expected Output: 
Current history: Google, YouTube */

import java.util.Stack;

class Q23Assign{
     public static void main(String[] args){
	 
	 Stack<String> pages = new Stack<>();
	 
	 pages.push("Google");
	 pages.push("YouTube");
	 pages.push("GFG");
	 
	 System.out.println("Initial History: " + pages);
		
		String undoneAction = pages.pop();
		System.out.println("Going back from: " + undoneAction);
		
		System.out.println("Current History: " +  pages);
		}
}
		