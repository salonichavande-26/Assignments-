/*Problem 8: Course Registration System 
Use Case: A student registers for courses, ensuring no duplicate course codes. 
Requirements: 
● Register for courses using course codes 
● Prevent duplicate registrations 
● Display registered courses 
Sample Input: 
Course codes: "CS101", "MA101", "CS101" 
Expected Output: 
Registered Courses: CS101, MA101 
*/

import java.util.HashSet;
import java.util.Set;

class Q8Assign {
    public static void main(String[] args) {
        Set<String> courses = new HashSet<>();
        
        String[] input = {"CS101", "MA101", "CS101" };
        
        for (String sub : input) {
            courses.add(sub);    
        }
        
        System.out.println("Unique course: " + courses);
    }
}