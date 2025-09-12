/*Problem 24: Salary Calculation 
Scenario: A payroll system retrieves employee ages from a database as Integer objects but needs 
primitive int values for mathematical calculations. 
Task: Demonstrate unboxing by extracting primitive values from wrapper objects. 
Sample Input: 
25 
Expected Output: 
int value: 25
*/

public class SalaryCalculation {
    public static void main(String[] args) {
         
        Integer employeeAge = 25;

         
        int primitiveAge = employeeAge;

         
        int newAge = primitiveAge + 5;

        System.out.println("Integer object value: " + employeeAge);
        System.out.println("int value: " + primitiveAge);
        System.out.println("New calculated age: " + newAge);
    }
}