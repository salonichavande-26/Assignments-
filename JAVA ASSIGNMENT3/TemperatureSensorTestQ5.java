/*5. Temperature Sensor
Scenario: Sensor should only accept temperatures in safe range.
Problem Statement:
Create a class TemperatureSensor with private temperature. Setter validates range 0–100°C.
Fields:
● private int temperature
Methods:
● setTemperature(int t) → only 0–100 valid
● getTemperature() → return temperature
Sample Input:
temperature = -5
Sample Output:
“Temperature out of range”
*/
class TemperatureSensor{
	private int temperature;
	
	 // Setter with validation
    public void setTemperature(int t) {
        if (t >= 0 && t <= 100) {
            this.temperature = t;
        } else {
            System.out.println("Temperature out of range");
        }
    }

    // Getter
    public int getTemperature() {
        return temperature;
    }
}

public class TemperatureSensorTestQ5 {
    public static void main(String[] args) {
        TemperatureSensor sensor1 = new TemperatureSensor();

        // Invalid case
        sensor1.setTemperature(-5);
        System.out.println("Sensor1 Temperature = " + sensor1.getTemperature());

        // Valid case
        TemperatureSensor sensor2 = new TemperatureSensor();
        sensor2.setTemperature(45);
        System.out.println("Sensor2 Temperature = " + sensor2.getTemperature());
    }
}