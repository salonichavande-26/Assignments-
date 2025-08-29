import java.util.Scanner;
public class TestScores{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter transaction amount: ");
	int transaction = sc.nextInt();
		
	
	if (transaction > 0 ){
		System.out.println("Deposit transaction.");
	} else if (transaction < 0){
		System.out.println("withdrawal of transaction.");
	} else{
		System.out.println(" No transaction ");
	}
	sc.close();
}
}