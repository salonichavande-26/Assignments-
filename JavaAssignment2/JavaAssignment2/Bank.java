class Bank{
	String accHolder;
	int balance;
	
	Bank(){
		
	}
	
	void setdata(String accHolder, int balance){
		this.accHolder = accHolder;
		this.balance = balance;
	}
	void getdata(){
		System.out.println("acc holder = " +accHolder);
		System.out.println("balance = "+balance);
	}
}

class MainBank{
	public static void main(String args[]){
		System.out.println("bank details");
		
		Bank e1 = new Bank();
		e1.setdata("Purva",78374);
		e1.getdata();
	}
}