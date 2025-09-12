 /*Problem 19: Message Update System 
Scenario: A communication system needs to update message status from "Old Notice" to "Updated 
Notice" when information is refreshed. 
Task: Use StringBuffer to update message status. 
Sample Input: 
Original text: Old Notice 
Text to find: Old 
Replacement text: Updated 
Expected Output: 
Updated Notice */
class MessageUpdateSystem {
    public static void main(String[] args) {
        String originalText = "Old Notice";
        String findText = "Old";
        String replacementText = "Updated";

         
        StringBuffer message = new StringBuffer(originalText);

         
        int startIndex = message.indexOf(findText);
 
        int endIndex = startIndex + findText.length();

         
        message.replace(startIndex, endIndex, replacementText);

         
        System.out.println(message);
    }
}