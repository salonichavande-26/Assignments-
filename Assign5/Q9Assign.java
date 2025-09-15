/*Problem 9: Event Attendance Counter 
Use Case: Count unique attendees at an event, handling duplicate check-ins. 
Requirements: 
● Record attendee names 
● Count only unique attendees 
● Handle duplicate entries 
Sample Input: 
Attendees: "Amit", "Rohan", "Amit", "Priya" 
Expected Output: 
Total unique attendees: 3 */

import java.util.HashSet;
import java.util.Set;

class Q9Assign {
    public static void main(String[] args) {
        Set<String> attendees  = new HashSet<>();
        
        String[] input = {"Amit", "Rohan", "Amit", "Priya"};
        
        for (String att : input) {
            attendees.add(att);    
        }
        
        System.out.println("Unique attendees : " + attendees );
    }
}