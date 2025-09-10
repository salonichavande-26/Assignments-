/*18. Payment Process  
Scenario: Company wants to process payments differently depending on mode of payment, but handle all 
payments through a single reference. 
Problem Statement: 
Create abstract class Payment with abstract method pay(). Subclass CreditCardPayment and UPIPayment 
implement pay(). 
Usage: 
● Use Payment p reference → p = new CreditCardPayment(...) or p = new UPIPayment(...) 
● Call p.pay() for runtime polymorphic behavior 
Sample Input: 
Credit Card → cardNumber=1234567890123456, amount=5000 
UPI → upiId=rahul@upi, amount=2000 
Sample Output: 
Payment via Credit Card 1234567890123456 → Rs. 5000 Paid 
Payment via UPI rahul@upi → Rs. 2000 Paid */

// Abstract class
abstract class Payment {
    abstract void pay();
}

// Subclass 1: Credit Card Payment
class CreditCardPayment extends Payment {
    String cardNumber;
    double amount;

    CreditCardPayment(String cardNumber, double amount) {
        this.cardNumber = cardNumber;
        this.amount = amount;
    }

    @Override
    void pay() {
        System.out.println("Payment via Credit Card " + cardNumber + " → Rs. " + amount + " Paid");
    }
}

// Subclass 2: UPI Payment
class UPIPayment extends Payment {
    String upiId;
    double amount;

    UPIPayment(String upiId, double amount) {
        this.upiId = upiId;
        this.amount = amount;
    }

    @Override
    void pay() {
        System.out.println("Payment via UPI " + upiId + " → Rs. " + amount + " Paid");
    }
}

// Test class
public class PaymentProcessQ18 {
    public static void main(String[] args) {
        // Using parent reference for polymorphism
        Payment p;

        p = new CreditCardPayment("1234567890123456", 5000);
        p.pay();

        p = new UPIPayment("rahul@upi", 2000);
        p.pay();
    }
}
