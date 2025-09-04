//Problem 18:  Vehicle Registration – */Static Counter 
Scenario: 
//Create Vehicle class with regNo, ownerName, vehicleType. 
//● Static variable: vehicleCount 
//● Constructor → auto-generate regNo as "MH-2025-" + vehicleCount 
//C-DAC MUMBAI
// ● Getter methods for all fields 
 
// Vehicle class
class Vehicle {
    String regNo;
    String ownerName;
    String vehicleType;

    // static counter
    static int vehicleCount = 0;

    // Constructor
    Vehicle(String ownerName, String vehicleType) {
        vehicleCount++;
        this.regNo = "MH-2025-" + vehicleCount;   // auto-generate regNo
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Getters
    public String getRegNo() {
        return regNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    // Method to display details
    public void showDetails() {
        System.out.println("RegNo: " + regNo + ", Owner: " + ownerName + ", Type: " + vehicleType);
    }
}

// Test class
class VehicleTest {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ramesh", "Car");
        Vehicle v2 = new Vehicle("Suresh", "Bike");

        v1.showDetails();
        v2.showDetails();
    }
}
