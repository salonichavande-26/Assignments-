/*Problem 10: Electronic Voting System 
Use Case: Track unique voters in an election system to prevent duplicate voting. 
Requirements: 
● Record voter IDs 
● Ensure one vote per voter 
● Count total unique voters 
Sample Input: 
Voter IDs: 201, 202, 203, 202 
Expected Output: 
Total voters: 3 */

import java.util.HashSet;
import java.util.Set;

class Q10Assign {
    public static void main(String[] args) {
        Set<Integer> votes  = new HashSet<>();
        
        int[] input = {201, 202, 203, 202 };
        
        for (int ID : input) {
            votes.add(ID);    
        }
        
        System.out.println("Unique voters : " + votes );
    }
}