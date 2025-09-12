/*Problem 21: Data Processing Cleanup 
Scenario: A data processing system handles user form submissions and must always close database 
connections and clean up resources, whether the processing succeeds or fails. 
Task: Use finally block to ensure proper resource cleanup. 
Sample Input: 
(No input required) 
Expected Output: 
Exception occurred: Invalid input 
Data processing completed*/


public class DataProcessingCleanup {

    public static void main(String[] args) {
        try { 
            processData();
        } catch (Exception e) { 
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
             
            System.out.println("Data processing completed");
        }
    }

    public static void processData() throws Exception {
         
        System.out.println("Starting data processing...");
         
        throw new Exception("Invalid input");
    }
}