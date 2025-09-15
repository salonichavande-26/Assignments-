import java.util.*;
import java.util.ArrayList;
import java.util.List;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return name + ":" + salary;
    }
}

class Q27Assign {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Amit", 50000));
        employees.add(new Employee("Priya", 60000));
        employees.add(new Employee("Rohan", 45000));

         
        employees.sort(Comparator.comparingDouble(e -> e.salary));

        System.out.println("Sorted by salary: " + employees);
    }
}
