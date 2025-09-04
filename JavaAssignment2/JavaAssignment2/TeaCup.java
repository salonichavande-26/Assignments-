class TeaCup {
	private String teaType;
	
	private static int totalCups = 0;
	
	public TeaCup(String teaType){
		this.teaType = teaType;
		totalCups++;
		
}
public String getTeaType(){
	return teaType;
}

public static void showTotalCups(){
	System.out.println("Total cups made: " + totalCups);
}

public static void main(String[] args){
	TeaCup cup1 = new TeaCup("Masala Tea");
        TeaCup cup2 = new TeaCup("Green Tea");
        TeaCup cup3 = new TeaCup("Ginger Tea");
		
		
		System.out.println("Cup1 type: " + cup1.getTeaType());
        System.out.println("Cup2 type: " + cup2.getTeaType());
        System.out.println("Cup3 type: " + cup3.getTeaType());
		
		 TeaCup.showTotalCups();
    } 
	
}
	