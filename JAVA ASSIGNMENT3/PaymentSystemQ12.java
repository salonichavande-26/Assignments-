/*12. Payment System 
Scenario: A company accepts different payment modes. 
Problem Statement: 
Create an abstract class Payment with abstract method pay(). Create subclasses CreditCardPayment and 
UPIPayment that implement pay(). 
Classes/Fields: 
● Payment → pay() (abstract) 
● CreditCardPayment → cardNumber, amount 
● UPIPayment → upiId, amount 
Sample Input: 
Credit Card → cardNumber=1234567890123456, amount=5000 
UPI → upiId=rahul@upi, amount=2000 
Sample Output: 
Payment via Credit Card 1234567890123456 → Rs. 5000 Paid 
Payment via UPI rahul@upi → Rs. 2000 Paid
*/


// Abstract superclass
abstract class Payment {
    abstract void pay();  // abstract method
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

// Test Class
public class PaymentSystemQ12 {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment("1234567890123456", 5000);
        Payment p2 = new UPIPayment("rahul@upi", 2000);

        p1.pay();
        p2.pay();
    }
}
