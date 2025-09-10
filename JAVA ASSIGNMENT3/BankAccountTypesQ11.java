/*11. Bank Account Types 
Scenario: Bank provides different account types. 
Problem Statement: 
Superclass Account → accountNo, balance. Subclass SavingAccount → interestRate. Subclass 
CurrentAccount → overdraftLimit. Display account details. 
Classes/Fields: 
● Account → accountNo, balance 
● SavingAccount → interestRate 
● CurrentAccount → overdraftLimit 
Sample Input: 
Saving → accountNo=101, balance=5000, interestRate=5% 
Current → accountNo=102, balance=10000, overdraftLimit=2000 
Sample Output: 
Saving → 101, Balance=5000, Interest=5% 
Current → 102, Balance=10000, Overdraft=2000
*/
// Superclass
class Account {
    int accountNo;
    double balance;

    Account(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    void showDetails() {
        System.out.println("Account No: " + accountNo + ", Balance=" + balance);
    }
}

// Subclass SavingAccount
class SavingAccount extends Account {
    double interestRate;

    SavingAccount(int accountNo, double balance, double interestRate) {
        super(accountNo, balance);
        this.interestRate = interestRate;
    }

    @Override
    void showDetails() {
        System.out.println("Saving → " + accountNo + ", Balance=" + balance + ", Interest=" + interestRate + "%");
    }
}

// Subclass CurrentAccount
class CurrentAccount extends Account {
    double overdraftLimit;

    CurrentAccount(int accountNo, double balance, double overdraftLimit) {
        super(accountNo, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void showDetails() {
        System.out.println("Current → " + accountNo + ", Balance=" + balance + ", Overdraft=" + overdraftLimit);
    }
}

// Test class
public class BankAccountTypesQ11 {
    public static void main(String[] args) {
        SavingAccount s1 = new SavingAccount(101, 5000, 5.0);
        CurrentAccount c1 = new CurrentAccount(102, 10000, 2000);

        s1.showDetails();
        c1.showDetails();
    }
}

 
		
	
		
		