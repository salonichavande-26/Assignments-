/*Problem 18: Ticket Number Verification 
Scenario: A ticketing system generates verification codes by reversing ticket numbers for security 
purposes. 
Task: Use StringBuffer to create verification codes. 
Sample Input: 
12345 
Expected Output: 
54321 */

class TicketNumberVerification {
    public static void main(String[] args) {
        int ticketNumber = 12345;
        
         
        StringBuilder sb = new StringBuilder(String.valueOf(ticketNumber));
        
        
        sb.reverse();
        
        
        System.out.println(sb);
    }
}	
