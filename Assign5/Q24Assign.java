import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

class Q24Assign{
      public static void main(String[] args){
	  Queue<String> jobs = new LinkedList<>();
	  
	  
	  
	  jobs.add("Doc1");
	  jobs.add("Doc2");
	  jobs.add("Doc3");
	  
	  System.out.println("Initial queue: " + jobs);
	  
	  String currentJob = jobs.poll();
	  
	  System.out.println("Printing " + currentJob + ", Queue:" + jobs);
}
}	  