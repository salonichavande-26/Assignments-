import java.util.Scanner;
public class LockerCheck{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter your Locker number: ");
	int lockerNumber = sc.nextInt();
		
	
	if (transaction %2 == 0 ){
		System.out.println("Locker number" + lockerNumber + "is Even");
	} else{
		System.out.println(" Locker number " + lockerrNumber + "is Odd");
	}
	sc.close();
}
}