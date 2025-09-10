/*26. Smart Devices  
Scenario: Smart devices can perform actions like calling, messaging, and browsing internet. 
Problem Statement: 
● Interface Callable → method makeCall(String number) 
● Interface Messaging → method sendMessage(String number, String message) 
● Interface Internet → method browse(String website) 
● Class SmartPhone implements all three interfaces → provide respective implementations 
Sample Input: 
Call → number="9876543210" 
Message → number="9876543210", message="Hello!" 
Browse → website="www.google.com" 
Sample Output: 
Calling 9876543210 
Sending message to 9876543210: Hello! 
Browsing website: www.google.com 
*/
interface Callable{
	void makeCall(String number);
}
interface Messaging{
	void sendMessage(String number, String message);
}
interface Internet{
	void browse(String website);
}
class SmartPhone implements Callable, Messaging, Internet{
	
	@Override
	public void makeCall(String number){
		System.out.println("calling" + number);
	}
	
	@Override
	public void sendMessage(String number, String message){
		System.out.println("Sending message to " + number + ":" + message);
	}
	
	@Override
	public void browse(String website) {
        System.out.println("Browsing website: " + website);
    }
}

public class SmartDevices{
	public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();

        
        phone.makeCall("9876543210");
        phone.sendMessage("9876543210", "Hello!");
        phone.browse("www.google.com");
    }
}