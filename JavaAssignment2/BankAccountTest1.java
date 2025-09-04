/*Problem 14: Bank Name Display 
Scenario: 
Add a static variable bankName = "CDAC Bank" and static method displayBankName() to 
BankAccount. 
● Call displayBankName() from main. 
● Create one account to verify instance creation.
*/
class BankAccount {
    String accountHolder;
    double balance;
    
    // Static variable for bank name
    static String bankName = "CDAC Bank";

    // Parameterized constructor
    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to show account details
    public void showDetails() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: " + balance);
    }

    // Static method to display bank name
    static void displayBankName() {
        System.out.println("Bank Name: " + bankName);
    }
}

class BankAccountTest {
    public static void main(String[] args) {
        // Call static method without creating object
        BankAccount.displayBankName();

        // Create one account
        BankAccount acc1 = new BankAccount("Rohit", 10000);

        // Show account details
        acc1.showDetails();
    }
}
