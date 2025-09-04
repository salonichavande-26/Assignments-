//Problem 19:  Vehicle Registration – Static Block 
Scenario: 
//Add a static block to Vehicle class: 
//● Print "Welcome to CDAC Vehicle Registration Portal" when class loads 
//● Verify that the message prints only once when multiple vehicles are created

class Vehicle {
    String regNo;
    String ownerName;
    String vehicleType;

    static int vehicleCount = 0;

    // 🔹 Static Block (runs only once when class is loaded)
    static {
        System.out.println("Welcome to CDAC Vehicle Registration Portal");
    }

    // Constructor
    Vehicle(String ownerName, String vehicleType) {
        vehicleCount++;
        this.regNo = "MH-2025-" + vehicleCount;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Method to display details
    void showDetails() {
        System.out.println("RegNo: " + regNo + ", Owner: " + ownerName + ", Type: " + vehicleType);
    }
}

// Test class
class VehicleTestQ19 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ramesh", "Car");
        Vehicle v2 = new Vehicle("Suresh", "Bike");

        v1.showDetails();
        v2.showDetails();
    }
}
