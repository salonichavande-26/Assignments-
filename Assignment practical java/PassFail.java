import java.util.Scanner;
public class PassFail{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter marks:");
		int marks = sc.nextInt();
		
		if(marks >= 35){
			System.out.print("you are pass");
		}
		else {
			System.out.print("you are fail");
		}
		sc.close();
	}
}

	
		
		
		
		
		
		