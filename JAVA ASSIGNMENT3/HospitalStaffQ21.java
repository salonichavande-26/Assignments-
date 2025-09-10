/*21. Hospital Staff  
Scenario: Hospital has Staff members. Both Doctors and Nurses are Staff. 
Problem Statement: 
● Staff → name, staffId, displayDetails() 
● Doctor → specialization, displayDetails() override 
● Nurse → shift, displayDetails() override 
Sample Input: 
Doctor → name=Dr. Reddy, staffId=101, specialization=Cardiology 
Nurse → name=Nisha, staffId=102, shift=Night 
Sample Output: 
Dr. Reddy → Staff ID=101, Specialization=Cardiology 
Nisha → Staff ID=102, Shift=Night */

// Base class Staff
class Staff {
    String name;
    int staffId;

    Staff(String name, int staffId) {
        this.name = name;
        this.staffId = staffId;
    }

    void displayDetails() {
        System.out.println(name + " → Staff ID=" + staffId);
    }
}

// Subclass Doctor
class Doctor extends Staff {
    String specialization;

    Doctor(String name, int staffId, String specialization) {
        super(name, staffId);
        this.specialization = specialization;
    }

    @Override
    void displayDetails() {
        System.out.println(name + " → Staff ID=" + staffId + ", Specialization=" + specialization);
    }
}

// Subclass Nurse
class Nurse extends Staff {
    String shift;

    Nurse(String name, int staffId, String shift) {
        super(name, staffId);
        this.shift = shift;
    }

    @Override
    void displayDetails() {
        System.out.println(name + " → Staff ID=" + staffId + ", Shift=" + shift);
    }
}

// Test Class
public class HospitalStaffQ21 {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("Dr. Reddy", 101, "Cardiology");
        Nurse n1 = new Nurse("Nisha", 102, "Night");

        d1.displayDetails();
        n1.displayDetails();
    }
}
