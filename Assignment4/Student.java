/*Problem 22: Student Object Cleanup 
Scenario: A student management system creates student objects during registration. When these objects 
are no longer needed, the system should clean up resources before garbage collection. 
Task: Override finalize method to demonstrate cleanup during garbage collection. 
Sample Input: 
Student Name: Amit 
Expected Output: 
Student object for Amit is being garbage collected */

class Student {
    String name;
    public Student(String name) { 
	this.name = name;
	}
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Student object for " + name + " is being garbage collected");
    }
}
public class StudentObjectCleanup {
    public static void main(String[] args) {
        new Student("Amit");
        System.gc();   
    }
}
