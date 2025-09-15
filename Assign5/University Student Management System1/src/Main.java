import java.util.*;

// ✅ Student class
class Student implements Comparable<Student> {
    int rollNo;
    String name;
    String department;
    double cgpa;

    public Student(int rollNo, String name, String department, double cgpa) {
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
    }

    // Merit List (CGPA descending)
    @Override
    public int compareTo(Student other) {
        return Double.compare(other.cgpa, this.cgpa);
    }

    @Override
    public String toString() {
        return name + "(" + cgpa + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        // 📌 Sample Students
        Student s1 = new Student(101, "Amit", "CS", 8.5);
        Student s2 = new Student(102, "Priya", "Math", 9.2);
        Student s3 = new Student(103, "Rohan", "CS", 7.8);
        Student s4 = new Student(104, "Sneha", "Physics", 4.5);

        // 1. Registration List
        List<Student> registrationList = new ArrayList<>(Arrays.asList(s1, s2, s3, s4));
        System.out.println("Registration Order: " + registrationList);

        // 2. Merit List (Comparable by CGPA)
        List<Student> meritList = new ArrayList<>(registrationList);
        Collections.sort(meritList);
        System.out.println("Merit List: " + meritList);

        // 3. Alphabetical List (Comparator)
        List<Student> alphaList = new ArrayList<>(registrationList);
        alphaList.sort(Comparator.comparing(st -> st.name));
        System.out.println("Alphabetical: " + alphaList);

        // 4. Department Grouping
        Map<String, List<Student>> deptGroups = new HashMap<>();
        for (Student st : registrationList) {
            deptGroups.computeIfAbsent(st.department, k -> new ArrayList<>()).add(st);
        }
        System.out.println("Department Groups:");
        for (String dept : deptGroups.keySet()) {
            System.out.println(dept + ": " + deptGroups.get(dept));
        }

        // 5. Unique Names
        Set<String> uniqueNames = new HashSet<>();
        for (Student st : registrationList) {
            uniqueNames.add(st.name);
        }

        // 6. Roll Number Sorting
        TreeSet<Student> rollSort = new TreeSet<>(Comparator.comparingInt(st -> st.rollNo));
        rollSort.addAll(registrationList);

        // 7. Performance Filter (remove CGPA < 5.0)
        List<Student> filtered = new ArrayList<>(registrationList);
        Iterator<Student> it = filtered.iterator();
        while (it.hasNext()) {
            if (it.next().cgpa < 5.0) it.remove();
        }
        System.out.println("After Filter (CGPA >= 5.0): " + filtered);

        // 8. Recent Registrations (Stack - LIFO)
        Stack<Student> recent = new Stack<>();
        for (Student st : registrationList) recent.push(st);

        // 9. Scholarship Queue (FIFO)
        Queue<Student> scholarshipQ = new LinkedList<>(registrationList);

        // 10. Hostel Applications (LinkedList for both ends)
        LinkedList<Integer> hostelApp = new LinkedList<>();
        hostelApp.addLast(105);  // regular
        System.out.println("Hostel Queue: \nAdd regular(105): " + hostelApp);

        hostelApp.addFirst(101); // priority
        System.out.println("Add priority(101): " + hostelApp);

        hostelApp.removeFirst(); // remove front
        System.out.println("Remove front: " + hostelApp);
    }
}
