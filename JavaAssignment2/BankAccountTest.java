//Problem 12: Bank Account Basic Info 
//Scenario: 
//Create BankAccount class with accountHolder and balance. 
//● Use parameterized constructor to initialize account. 
//● Create getter and setter for balance. 
//● In main, create one account and display details.

class BankAccount {
    String accountHolder;
    double balance;

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

    // Display account details
    public void showDetails() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: " + balance);
    }
}

class BankAccountTest {
    public static void main(String[] args) {
        // Create one account
        BankAccount acc1 = new BankAccount("Saloni", 5000);

        // Show initial details
        acc1.showDetails();

        // Update balance
        acc1.setBalance(7500);

        // Show updated details
        acc1.showDetails();
    }
}
