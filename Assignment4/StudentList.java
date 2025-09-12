/*Problem 7: Student List 
Scenario: A school management system tries to load a student list from a file at the beginning of each 
semester. Sometimes the file might not exist or be corrupted. 
Task: Simulate file reading operation and handle FileNotFoundException. 
Sample Input: 
student_list.txt 
Expected Output: 
File not found 
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class StudentList {
    public static void main(String[] args) {
        try {
            // Trying to open the file
            File file = new File("student_list.txt");
            Scanner sc = new Scanner(file);

            // If file exists, print contents
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
	