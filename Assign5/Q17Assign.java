import java.util.HashMap;
import java.util.Map;

public class Q17Assign{
        public static void main(String[] args){
		
		String[] grades = {"A","B","A","C","B","A"};
		
		Map<String, Integer> dist = new HashMap<>();
		
		for(String g : grades){
		      dist.put(g, dist.getOrDefault(g, 0) + 1);
		}
		
		System.out.println("Grade Distribution:" + dist);
		}
		}
           