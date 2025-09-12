/*Problem 16: Room Allocation Update 
Scenario: A facility management system assigns rooms to different activities and needs to insert building 
information into existing room numbers. 
Task: Use StringBuffer to update room allocation information. 
Sample Input: 
Original text: 101 
Text to insert: New Building  
Insert index: 0 
Expected Output: 
New Building 101
*/
class RoomAllocationUpdate{
	public static void main(String[] args){
		StringBuilder sb = new StringBuilder(101);
		
		sb.insert(0, "New Building ");
		
		
		System.out.println(sb);
	}
}