/*24. Payment Gateway  
Scenario: An e-commerce platform supports multiple payment methods like CreditCard and PayPal. All 
payments must implement a pay() method. 
Problem Statement: 
● Create an interface Payment → method pay(double amount) 
● Classes CreditCardPayment and PayPalPayment implement Payment → provide their own pay() 
implementation 
● In main(), take payment amount and process payment using both methods 
Sample Input: 
CreditCardPayment → amount=2500 
PayPalPayment → amount=1500 
Sample Output: 
Processing Credit Card Payment of 2500 
Processing PayPal Payment of 1500 
*/
interface Payment{
	void pay(double amount);
}

class CreditCardPayment implements Payment{
String cardNumber;

CreditCardPayment(String cardNumber){
this.cardNumber = cardNumber;
}
@Override
public void pay(double amount){
System.out.println("Payment of Rs. " + amount + "made using Credit Card: " + cardNumber);
}
}

class PayPalPayment implements Payment{
String  message;

PayPalPayment(String message){
this.message = message;
}
@Override
public void pay(double amount){
System.out.println("Payment of Rs. " + amount + "made using Credit Card: " + message);
}
}
public class PaymentGatewayQ24{
	public static void main(String[] args){
		Payment p1 = new CreditCardPayment("1234-5678-9011-2233");
		Payment p2 = new PayPalPayment("Payment is done");
		
		p1.pay(2500);
		p2.pay(1500);
	}
}


	

	