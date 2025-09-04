class BankAccount {
    String name;
    double balance;
    static double interestRate;

    // Constructor
    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // Static block
    static {
        interestRate = 4.0;
        System.out.println("Bank Interest Rate Initialized: " + interestRate + "%");
    }

    // Getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public static double getInterestRate() {
        return interestRate;
    }
    public static void setInterestRate(double rate) {
        interestRate = rate;
    }

    // Method to show details
    public void showDetails() {
        System.out.println("Name=" + name + ", Balance=" + balance + ", Interest Rate=" + interestRate + "%");
    }
}

// Separate demo/test class
class BankDemo {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Rohit", 5000);
        BankAccount account2 = new BankAccount("Priya", 15000);

        account1.showDetails();
        account2.showDetails();
    }
}
