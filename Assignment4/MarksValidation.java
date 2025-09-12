/*Problem 9: Marks Validation 
Scenario: An online examination system needs to validate that marks entered by teachers are within valid 
range (0-100). Negative marks should not be allowed. 
Task: Create a marks validation method that throws an exception for invalid marks. 
Sample Input: -5 
Expected Output: 
Invalid marks 
*/
import java.util.Scanner;
class InvalidMarksException extends Exception{
	public InvalidMarksException(String Message){
		super(Message);
	}
}
class MarksValidation{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter marks: ");
	int marks = sc.nextInt();
	
	try{
		if (marks < 0){
			throw new InvalidMarksException("Invalid marks!!");
		}
		else {
			System.out.println("Marks entered: " + marks);
		}
	}
	catch(InvalidMarksException e){
		System.out.println(e.getMessage());
	}
}
}
	