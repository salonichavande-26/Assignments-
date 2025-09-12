/*Problem 17: Remove Outdated Information 
Scenario: An academic system maintains course information that includes year details. When information 
becomes outdated, the year needs to be removed. 
Task: Use StringBuffer to remove outdated information. 
Sample Input: 
Original text: CDAC Kharghar 2024 
Exact substring to delete: 2024 
Expected Output: 
CDAC Kharghar */
class RemoveOutdatedInformation{
	public static void main(String[] args){
		StringBuilder sb = new StringBuilder("CDAC Kharghar 2024");
		sb.delete(14,18);
		System.out.println(sb);
	}
}
	