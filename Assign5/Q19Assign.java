import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

 class Q18Assign{
         public static void main(String[] Args){
		 Map<String, Integer> grade = new HashMap<>();
		 
		 grade.put("Amit", 85);
		 grade.put("Priya", 92);
		 
		 Iterator<Map.Entry<String, Integer>> iterator = grade.entrySet().iterator();
		 
		 System.out.print("grade report: ");
		 
		 while(iterator.hasNext()){
		 Map.Entry<String, Integer> entry = iterator.next();
		 
		 System.out.print(entry.getKey() + ":" + entry.getValue());
		 
		 if (iterator.hasNext()){
		      System.out.print(", ");
			  }
			  }
			  }
			  }