

class Student {
      int rollNo;
     String name;
      int marks;

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

    // Method to display student details
    public void showDetails() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks);
    }
}

class StudentMarksChecker {
    public static void main(String[] args) {
        // Create a student
        Student s1 = new Student(101, "Anjali", 80);

        // Print initial details
        System.out.println("Initial Details:");
        s1.showDetails();

        // Update marks using setter
        s1.setMarks(90);

        // Print updated details
        System.out.println("After Updating Marks:");
        s1.showDetails();
    }
}
