/*23. School Members  
Scenario: School has members: Teachers, Students, and Staff. All share common info. 
Problem Statement: 
● Member → name, id, displayInfo() 
● Teacher → subject, overrides displayInfo() 
● Student → grade, overrides displayInfo() 
● Staff → department, overrides displayInfo() 
Sample Input: 
Teacher → name=Mr. Kumar, id=101, subject=English 
Student → name=Riya, id=201, grade=10 
Staff → name=Mr. Das, id=301, department=Maintenance 
Sample Output: 
Mr. Kumar → ID=101, Subject=English 
Riya → ID=201, Grade=10 
Mr. Das → ID=301, Department=Maintenance
*/

class Member{
	String name;
	int ID;
	
	Member(String name, int ID){
	 	this.name = name;
		this.ID = ID;
	}
 
void displayInfo(){
	System.out.println(name + ": ID=" + ID);
}
}
class Teacher extends Member{
	String subject;
	 
	 Teacher(String name, int ID, String subject){
		 super(name, ID);
		 this.subject = subject;
	 }
	 @Override
	 void displayInfo(){
		 System.out.println(name + ": ID=" + ID + ", subject=" + subject);
	 }
}
class Student extends Member{
	int grade;
	
	Student(String name, int ID, int grade) {
        super(name, ID);
        this.grade = grade;
    }
	@Override
	void displayInfo(){
		System.out.println(name + ": ID=" + ID + ", grade=" + grade);
	}
}
class Staff extends Member{
	String department;
	
	Staff(String name, int ID, String department){
		super(name, ID);
		 this.department = department;
	}
	@Override
	void displayInfo(){
		System.out.println(name + ": ID=" + ID + ", department=" + department);
	}
}
public class SchoolMemberQ23{
	public static void main(String[] args){
		Teacher t1 = new Teacher("Mr. Kumar", 101,"English");
		Student s1 = new Student("Riya", 201, 10);
		 Staff st1 = new Staff("Mr. Das", 301, "Maintenance");
		
		
		t1.displayInfo();
		s1.displayInfo();
		st1.displayInfo();
		
	
	}
}

