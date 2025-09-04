class Book {
	String model;
	 static int totalMobiles;
     

       
	 Mobile(String model){
		this.model = model;
		totalMobiles++;
	}
	
	 String getModel(){
		return model;
	}
	static void showTotalMobiles(){
		System.out.println("totalMobiles" +  totalMobiles);
	}
	
}
class MobileTest {
	public static void main(String args[]){
		Mobile m1 = new Mobile("Samsung");
		Mobile m2 = new Mobile("iphone");
		Mobile m3 = new Mobile("OnePlus");
		
		System.out.println("Mobile1: " + m1.getModel());
		System.out.println("Mobile2 : " + m2.getModel());
		System.out.println("Mobile3 : " + m2.getModel());
	
        Mobile.showTotalMobiles();
	}
	
	   
		
		 
	}

	
	
	
	