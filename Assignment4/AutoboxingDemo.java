/*Problem 23: Employee Age Management 
Scenario: An HR system stores employee ages in a database. The system needs to convert primitive int 
values to Integer objects for database storage and collection operations. 
Task: Demonstrate autoboxing by converting primitive int to Integer object. 
Sample Input: 
30 
Expected Output: 
Integer object: 30*/

public class AutoboxingDemo{
public static void main(String[] args){
int primitiveInt = 30;
Integer integerObject = primitiveInt;
System.out.println("Primitive int value: " + primitiveInt);
        System.out.println("Integer object value: " + integerObject);
    }
}