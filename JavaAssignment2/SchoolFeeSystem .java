class Student {
      String name;
     String className;
    static int tuitionFee;

    // Static block (runs once when the class is loaded)
    static {
        tuitionFee = 30000;
        System.out.println("School Tuition Fee Initialized: " + tuitionFee);
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    // Method to show details
    public void showDetails() {
        System.out.println("Name=" + name + ", Class=" + className + ", Tuition Fee=" + tuitionFee);
    }
}

class SchoolFeeSystem {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Anjali");
        s1.setClassName("10th");

        Student s2 = new Student();
        s2.setName("Vikram");
        s2.setClassName("12th");

        System.out.println("Student1: " + "Name=" + s1.getName() + ", Class=" + s1.getClassName() + ", Tuition Fee=" + Student.tuitionFee);
        System.out.println("Student2: " + "Name=" + s2.getName() + ", Class=" + s2.getClassName() + ", Tuition Fee=" + Student.tuitionFee);
    }
}
