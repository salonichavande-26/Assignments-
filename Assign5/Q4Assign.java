/*Problem 4: Grocery Shopping List 
Use Case: A person maintains a grocery list and removes items as they purchase them. 
Requirements: 
● Add items to grocery list 
● Remove purchased items 
● Display remaining items 
Sample Input: 
Add items: "Milk", "Eggs", "Bread" 
Purchase: "Milk" 
Expected Output: 
Items to buy: Eggs, Bread*/

import java.util.List;
import java.util.ArrayList;

class Q4Assign{
	public static void main(String[] Args){
		List<String> grocery = new ArrayList<>();
		
		grocery.add("Milk");
		grocery.add("Eggs");
		grocery.add("Bread");
	
		System.out.println(grocery);	
		
		System.out.println("Purchase Item: " +  "Milk" );
		//for(String item: grocery){
		//	System.out.print(item + " ");
		//}
		
		System.out.println();
		
		grocery.remove("Milk");
		
		System.out.println("Items to buy: " + " ");
		for(String item: grocery){
			System.out.print(item + " ");
		}
		System.out.println();
	}
}