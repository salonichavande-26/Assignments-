import java.util.*;
import java.util.ArrayList;
import java.util.List;

class Student {
    String name;
    String grade;

    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String toString() {
        return name + ":" + grade;
    }
}

class Q29Assign {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Amit", "A"));
        students.add(new Student("Priya", "B"));

        System.out.println("Student Records: " + students);
    }
}
