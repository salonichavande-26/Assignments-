/*Problem 16: Employee Net Salary 
Scenario: 
Extend previous problem. Add method calculateNetSalary(): 
● Add 10% HRA, 5% DA, deduct 2% PF from basicSalary 
● Print net salary for 2 employees
*/ 
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

    // Method to calculate Net Salary
    public double calculateNetSalary() {
        double hra = 0.10 * basicSalary;  // 10% HRA
        double da = 0.05 * basicSalary;   // 5% DA
        double pf = 0.02 * basicSalary;   // 2% PF deduction

        return basicSalary + hra + da - pf;
    }

    // Method to display details with net salary
    public void showDetails() {
        System.out.println("Employee ID: " + id + 
                           ", Name: " + name + 
                           ", Basic Salary: " + basicSalary + 
                           ", Net Salary: " + calculateNetSalary());
    }
}

class EmployeeTestQ16 {
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
