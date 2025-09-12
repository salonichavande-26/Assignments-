 /*Problem 25: Payment Processing 
Scenario: An e-commerce system receives payment amounts as strings from web forms and needs to 
convert them to integers for financial calculations. 
Task: Parse string input to integer and perform calculations. 
Sample Input: 
Amount as string: 1000 
Additional amount to add: 500 
Expected Output: 
1000 + 500 = 1500 */
 
public class PaymentProcessing {
    public static void main(String[] args) {
        String amountAsString = "1000";
        String additionalAmountAsString = "500";

        
        int amount = Integer.parseInt(amountAsString);
        int additionalAmount = Integer.parseInt(additionalAmountAsString);

         
        int totalAmount = amount + additionalAmount;

         
        System.out.println(amountAsString + " + " + additionalAmountAsString + " = " + totalAmount);
    }
}