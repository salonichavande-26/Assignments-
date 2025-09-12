/*Problem 26: Salary Storage 
Scenario: A financial system needs to convert primitive double salary values to Double objects for 
storage in collections and database operations. 
Task: Use valueOf method to convert primitives to wrapper objects. 
Sample Input: 
45000.5 
Expected Output: 
Double object: 45000.5 
*/

 class SalaryStorage {
    public static void main(String[] args) {
        Double salary = Double.valueOf(45000.5);
        System.out.println("Double object: " + salary);
    }
}
