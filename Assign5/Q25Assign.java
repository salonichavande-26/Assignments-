import java.util.LinkedList;
import java.util.Queue;

class Q25Assign{
          public static void main(String[] args){
		  
		  Queue<String> command = new LinkedList<>();
		  int limit = 3;
		  
		   String[] inputs = {"ls", "pwd", "cd ..", "mkdir"};
		  
		  System.out.println("All Commands: " + command);
		  
		  
           for (String newCommand : inputs) {
            if (command.size() == limit) {
                command.poll(); 
            }
            command.add(newCommand);  
        }

        System.out.println("Recent Commands: " + command);
    }
}