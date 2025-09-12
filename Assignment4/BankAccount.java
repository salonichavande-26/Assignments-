/*Problem 20: Bank Account Security 
Scenario: A banking system needs to ensure that once a bank account ID is assigned, it cannot be 
changed for security and audit purposes. 
Task: Demonstrate the use of final variables in a banking context. 
Sample Input: 
Account ID: 101 
Expected Output: 
Account ID = 101 (cannot be changed) */

class BankAccount {
     
    final int accountId;
 
    public BankAccount(int id) {
        this.accountId = id;
    }
 
    public void displayAccountId() {
        System.out.println("Account ID = " + accountId + " (cannot be changed)");
    }
}

class BankAccountSecurity {
    public static void main(String[] args) {
         
        BankAccount account = new BankAccount(101);
      
        account.displayAccountId();
       
    }
}