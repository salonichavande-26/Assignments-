/*19. Bank Account Types  
Scenario: Bank manages different types of accounts: Savings and Current. Both share basic account 
details, but Savings accounts have interest and Current accounts have overdraft limit. 
Problem Statement: 
Create a superclass BankAccount with: 
● Fields: accountNumber, accountHolder, balance 
● Method: displayBalance() 
Create subclasses: 
● SavingsAccount → field: interestRate, method: calculateInterest() 
● CurrentAccount → field: overdraftLimit, method: checkOverdraft() 
Sample Input: 
SavingsAccount → accountNumber=101, accountHolder=Ramesh, balance=5000, interestRate=5% 
CurrentAccount → accountNumber=102, accountHolder=Anita, balance=2000, overdraftLimit=1000 
Sample Output: 
Ramesh → Balance=5000, Interest=250 
Anita → Balance=2000, Overdraft Limit=1000 
*/
// Base class
class BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;

    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void displayBalance() {
        System.out.println(accountHolder + " → Balance=" + balance);
    }
}

// SavingsAccount subclass
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    void calculateInterest() {
        double interest = balance * (interestRate / 100);
        System.out.println(accountHolder + " → Balance=" + balance + ", Interest=" + interest);
    }
}

// CurrentAccount subclass
class CurrentAccount extends BankAccount {
    double overdraftLimit;

    CurrentAccount(int accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    void checkOverdraft() {
        System.out.println(accountHolder + " → Balance=" + balance + ", Overdraft Limit=" + overdraftLimit);
    }
}

// Test class
public class BankAccountTypesQ19 {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount(101, "Ramesh", 5000, 5);
        CurrentAccount c1 = new CurrentAccount(102, "Anita", 2000, 1000);

        s1.calculateInterest();
        c1.checkOverdraft();
    }
}
