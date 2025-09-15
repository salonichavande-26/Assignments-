import java.util.Stack;

class Q21Assign{
        public static void main(String[] args){
		
		Stack<String> actions = new Stack<>();
		
		actions.push("Type A");
		actions.push("Type B");
		actions.push("Delate");
		
		System.out.println("Action History: " + actions);
		
		String undoneAction = actions.pop();
		System.out.println("Undo Action: " + undoneAction);
		
		System.out.println("Current Action History: " +  actions);
		}
}
		
		