/*2. Student Marks 
Scenario: A teacher wants to update student marks but must ensure marks are valid. 
Problem Statement: 
Create a class Student with private marks. Create getter and setter with validation (0–100). 
Fields: 
● private int marks 
Methods: 
● setMarks(int marks) → validate and set 
● getMarks() → return marks 
Sample Input: 
marks = 85 
Sample Output: 
Marks = 85 
*/
class Student{
	private int marks; //Private field (cannot be accessed direclty outside)
	
	Student(){
		marks = 100;
	}
	
	//setter with validation
	void setMarks(int marks) {
		if (marks >= 0 && marks <= 100){
			this.marks = marks;
		}
		else {
			System.out.println("Invalid Marks");
		}
	}
	
	//getter 
	public int getMarks(){
		return marks;
	}
}
//test case
public class StudentMarksQ2{
	public static void main(String[] args){
		Student s1 = new Student();
		//valid case
		s1.setMarks(85);
		System.out.println("Student Marks = " + s1.getMarks());
		//invalid case
		s1.setMarks(120);
		System.out.println("Student Marks (after invalid attempt) = " + s1.getMarks());
	}
}
 