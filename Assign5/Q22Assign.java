import java.util.Queue;
import java.util.LinkedList;

class Q22Assign{
     public static void main(String[] args){
	       Queue<String> customers = new LinkedList<>();
		   
		   customers.offer("Amit");
		   customers.offer("Priya");
		   customers.offer("Rohan");
		   
		   System.out.println("Initial Queue: " + customers);
		   
		   String servedCustomer = customers.poll();
		   System.out.println("Serving: " + servedCustomer);
		   System.out.println("Queue: " + customers);
	 }
}
		   