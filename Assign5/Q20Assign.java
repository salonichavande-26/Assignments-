import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class Q20Assign{
        public static void main(String[] args){
		
		List<Integer> rollNumbers = new ArrayList<>();
		
		rollNumbers.add(101);
		rollNumbers.add(102);
		rollNumbers.add(103);
		rollNumbers.add(104);
		
		System.out.println("Roll Numbers: " + rollNumbers);
		
		Iterator<Integer> iterator = rollNumbers.iterator();
		
		System.out.print("Roll Numbers: ");
		
		while(iterator.hasNext()){
		 Integer rollNumber = iterator.next();
		 
		 if (rollNumber % 2 != 0) {
                iterator.remove();
		    }
		}
		   System.out.println("Roll numbers(even): " + rollNumbers);
	}
}
		