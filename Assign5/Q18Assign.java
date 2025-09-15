import java.util.LinkedHashSet;
import java.util.Arrays;
import java.util.Set;
import java.util.List;

class Q18Assign{
	public static void main(String[] args){
		List<String> morning = Arrays.asList("Amit", "Priya");
		
		List<String> evening = Arrays.asList("Rohan", "Priya");
		
		Set<String> mergedBatch = new LinkedHashSet<>();
		
		mergedBatch.addAll(morning);
		mergedBatch.addAll(evening);
		
		System.out.println("Combined batches: " + mergedBatch);
	}
}