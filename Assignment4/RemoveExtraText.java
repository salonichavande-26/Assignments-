/*Problem 12: Remove Extra Text 
Scenario: An automated message system sometimes adds extra text that needs to be removed before 
sending messages to students. 
Task: Use StringBuilder to clean up message content. 
Sample Input: 
Original Text: Please read - Do not disturb 
Exact substring to delete: - Do not disturb 
Expected Output: 
Please read 
*/
class RemoveExtraText{
	public static void main(String[] args){
		StringBuilder sb = new StringBuilder("Please read - Do not disturb");
		
		int startIndex = sb.indexOf("- Do not disturb");
        sb.delete(startIndex, sb.length());
        System.out.println(sb);
	}
}