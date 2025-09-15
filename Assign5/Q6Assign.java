/*Problem 6: Unique Roll Number Validator 
Use Case: A registration system must ensure no duplicate roll numbers are assigned. 
Requirements: 
● Accept roll numbers for registration 
● Automatically remove duplicates 
● Display unique roll numbers 
Sample Input: 
Roll numbers: 101, 102, 101, 103 
Expected Output: 
Unique Roll Numbers: 101, 102, 103 */

import java.util.HashSet;
import java.util.Set;

class Q6Assign {
    public static void main(String[] args) {
        Set<Integer> rollNumbers = new HashSet<>();
        
        int[] input = {101, 102, 101, 103};
        
        for (int rollNumber : input) {
            rollNumbers.add(rollNumber);    
        }
        
        System.out.println("Unique Roll Numbers: " + rollNumbers);
    }
}
 
