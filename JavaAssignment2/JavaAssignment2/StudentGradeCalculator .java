/*
Problem 10: Student Marks Checker 
Scenario: 
Create a Student class with rollNo, name, and marks. 
● Use a parameterized constructor to initialize all fields. 
● Create a getter and setter for marks. 
● In main, create one student, update marks using setter, and print student details. 
*/
class Student {
    private int rollNo;
    private String name;
    private int marks;

    // Parameterized constructor
    public Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Getter and Setter for marks
    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    // Calculate grade based on marks
    public String calculateGrade() {
        if (marks >= 80) {
            return "A";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 40) {
            return "C";
        } else {
            return "Fail";
        }
    }

    // Display details
    public void showDetails() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + 
                           ", Marks: " + marks + ", Grade: " + calculateGrade());
    }
}

class StudentGradeCalculator {
    public static void main(String[] args) {
        // Create 2 students
        Student s1 = new Student(101, "Anjali", 85);
        Student s2 = new Student(102, "Vikram", 45);

        // Print student details
        s1.showDetails();
        s2.showDetails();
    }
}

