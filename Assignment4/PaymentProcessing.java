/*oblem 8: Payment Processing 
Scenario: A payment gateway system processes transactions and needs to clean up database connections 
(just a scenario, database knowledge not required) regardless of whether the payment succeeds or fails. 
Task: Create a payment processing method that uses finally block for cleanup operations. 
Sample Input: 
(No input required) 
Expected Output: 
Exception occurred: Payment failed   
Cleanup done
*/ 

class PaymentProcessing{
	public static void main(String[] args){
		processPayment(1000, 2);
		processPayment(1000, 2);
	}
		static void processPayment(int amount, int quantity) {
        try {
            int total = amount / quantity;  // may throw ArithmeticException
            System.out.println("Payment processed. Total: " + total);
        } 
        catch (ArithmeticException e) {
            System.out.println("Exception occurred: Payment failed");
        } 
        finally {
            System.out.println("Cleanup done");
        }
    }
}
	

			
	
