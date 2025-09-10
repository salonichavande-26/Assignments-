/*1. Bank Account Protection 
Scenario: You are creating a simple banking system. A user should not be able to directly change their 
balance. 
Problem Statement: 
Create a class BankAccount with a private variable balance. Provide deposit() and withdraw() methods to 
change balance. Provide a getter to view balance. Validate that withdrawal cannot exceed balance. 
Class/Fields: 
● private double balance 
Methods: 
● deposit(double amount) → add to balance 
● withdraw(double amount) → subtract from balance if sufficient 
● getBalance() → returns current balance 
Sample Input: 
Deposit = 5000 
Withdraw = 2000 
Sample Output: 
Updated Balance = 3000 
*/
class BankAccount{
	private double balance;
	
	BankAccount() {
		balance = 0.0;
	}
	void deposit(double amount){
		if (amount > 0){ 
		balance += amount;
		System.out.println("Deposited: " + amount);
		}
		else {
			System.out.println("Deposit amount must be positive!");
		}
	}
	
	void withdraw(double amount){
		if (amount > balance) {
			System.out.println("Insufficient Balance! Withdrawal failed.");
		}
		else if (amount <= 0) {
			System.out.println("Invalid withdrawal amount!");
		}
		else {
			balance -= amount;
			System.out.println("Withdrawn: " + amount);
		}
	}
	double getBalance(){
		return balance;
	}
}

class BankAccountTestQ1{
	public static void main(String[] args){
		BankAccount account = new BankAccount();
		
		account.deposit(5000); 
		account.withdraw(2000);
		
		System.out.println("Updated Balance =" + account.getBalance());
	}
}