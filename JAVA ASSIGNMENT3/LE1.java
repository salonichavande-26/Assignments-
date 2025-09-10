class LE1{
	try{
		int i = i/0;
	}
	catch(Exception e){
		System.out.println("2");
		e.printStackTrace();
		System.out.println("3");
		
		try{
			System.out.println("4");
			throw e;
		}
		catch(ArithmeticException e){
			System.out.println("5");
			e.printStackTrace();
			System.out.println("6");
			throw e1;
		}
		finally{
			System.out.println("Release resource");
		}
		System.out.println("stop");
	}
}