class Employee {
    int id;
    String name;
    double basicSalary;

    // static counter for auto ID generation
    static int counter = 1001;

    // Default constructor
    Employee() {
        this.id = counter++;
        this.name = "Unknown";
        this.basicSalary = 20000;
    }

    // Parameterized constructor
    Employee(String name, double basicSalary) {
        this.id = counter++;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    // Method to display details
    public void showDetails() {
        System.out.println("Employee ID: " + id + ", Name: " + name + ", Salary: " + basicSalary);
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        // Using default constructor
        Employee e1 = new Employee();

        // Using parameterized constructor
        Employee e2 = new Employee("Ravi", 35000);

        // Display employee details
        e1.showDetails();
        e2.showDetails();
    }
}
