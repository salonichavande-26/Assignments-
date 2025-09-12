/*Problem 13: Order Number Display 
Scenario: An e-commerce system generates invoice numbers and needs to display them in reverse order 
for verification purposes. 
Task: Use StringBuilder to reverse order numbers. 
Sample Input: 
INV2025 
Expected Output: 
5202VNI */
class OrderNumberDisplay{
	public static void main(String[] args){
		StringBuilder sb = new StringBuilder("INV2025");
		
		sb.reverse();
		System.out.println(sb);
	}
}