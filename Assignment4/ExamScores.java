/*Problem 2: Exam Scores 
Scenario: A teacher is using a digital gradebook system to access student scores. Sometimes they might 
accidentally try to access the score of a student number that doesn't exist in the class roster. 
 
Task: Create a program that stores exam scores in an array and safely accesses student scores by index. 
 
Sample Input: 
3 
78 90 85 
5 
 
Expected Output: 
Invalid index accessed */


//import java.util.Scanner;

class  ExamScores{
	public static void main(String[] args){
	
	//Scanner sc = new Scanner(System.in);
   	//int Scores = sc.nextInt(); 
	int arr[] = {78, 90, 85};
	int index = 5;
	
	try{
		int s = arr[index];
		System.out.println(s);
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Invalid index Accessed");
	}
	}
}

		

