/*
Problem 7: Indian Movie Ticket Booking 
Scenario: 
A cinema hall offers Normal and Premium tickets. A customer can book just name or name with 
ticket type. Keep track of total tickets sold using a static counter. 
Tasks: 
1. Create a Customer class. 
2. Implement two constructors: 
Constructor 1 → Customer(String name) 
Constructor 2 → Customer(String name, String ticketType) 
3. Static counter to track tickets sold. 
4. Print customer details and total tickets sold. 
Input Example: 
Customer1: "Rahul" 
Customer2: "Pooja", "Premium" 
Customer3: "Amit" 
Expected Output: 
Customer1: Name: Rahul, Ticket: Normal 
Customer2: Name: Pooja, Ticket: Premium 
Customer3: Name: Amit, Ticket: Normal 
Total Tickets Sold: 3 
Problem 8: Bank Account Initialization 
Scenario: 
A bank wants to initialize the interest rate for all accounts once when the system starts. Each account 
has account holder name, balance, and interest rate. Students should practice static blocks for 
initialization and setters/getters to modify and access account details. 
Tasks: 
1. Create a BankAccount class. 
2. Use a static block to initialize interest rate to 4%. 
3. Create instance variables: name (String) and balance (double). 
4. Create setters and getters for name and balance. 
5. Print account details including interest rate. 
Input Example: 
Account1: Name="Rohit", Balance=5000 
Account2: Name="Priya", Balance=15000 
Expected Output: 
Bank Interest Rate Initialized: 4.0% 
Account1: Name=Rohit, Balance=5000.0, Interest Rate=4.0% 
Account2: Name=Priya, Balance=15000.0, Interest Rate=4.0% 
C-DAC 
*/

class customer{
	String name;
	String ticketType;
	static int ticketSold;
	
	Customer(String name){
		this.name = name;
		ticketSold++;
	}
	Customer(String name, String ticketType){
		this.name = name;
		this.ticketType = ticketType;
		ticketSold++;
	}
	void showDetails(){
		System.out.println("total ticket sold:" + ticketSold);
	}
}
class MovieTicket{
	public static void main(String args[]){
		Customer c1 = new Customer("Rahul", "Normal");
		Customer c2= new Customer("Pooja" ,"Premium");
		Customer c3 = new Customer("Amit" , "Normal");
		
		c1.showDetails();
		c2.showDetails();
		c3.showDetails();
		
		Customer.showticketSold();
	}
}
	
	