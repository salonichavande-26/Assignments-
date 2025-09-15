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

    @Override
    public String toString() {
        return name + ":" + grade;
    }
}

public class GradeBasedStudentFilter {
    public static void main(String[] args) {
        // Step 1: Store students
        List<Student> students = new ArrayList<>();
        students.add(new Student("Amit", "A"));
        students.add(new Student("Priya", "C"));
        students.add(new Student("Rohan", "B"));

        // Step 2: Filter students with grade >= B
        List<Student> qualified = new ArrayList<>();
        for (Student s : students) {
            if (s.grade.equals("A") || s.grade.equals("B")) {
                qualified.add(s);
            }
        }

        // Step 3: Display results
        System.out.print("Qualified Students: ");
        for (int i = 0; i < qualified.size(); i++) {
            System.out.print(qualified.get(i));
            if (i < qualified.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
