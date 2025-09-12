/*Problem 3: Age Input 
Scenario: A registration form for an online course asks for the user's age. Sometimes users accidentally 
enter text instead of numbers, causing the system to crash. 
 
Task: Create a registration system that safely converts age input from string to integer. 
 
Sample Input: 
eighteen 
 
Expected Output: 
Invalid number format
*/
import java.util.Scanner;

class AgeInput{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age: ");
		String ageInput = sc.nextLine();
		
		try{
			int age = Integer.parseInt(ageInput);
			System.out.println("Registration successful. Age: " + age);
        } catch (NumberFormatException e) {
            System.out.println("Invalid age input. Please enter a number.");
        }
    }
}
		
		
		
