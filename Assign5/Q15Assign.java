import java.util.Map;
import java.util.HashMap;

class Q15Assign {
    public static void main(String[] args) {
        Map<String, Integer> inventory = new HashMap<>();

        
        inventory.put("Java", 3);
        inventory.put("Python", 5);

        System.out.println("Initial Inventory: " + inventory);

         
        String book = "Java";
        if (inventory.containsKey(book)) {
            int copies = inventory.get(book);
            if (copies > 0) {
                inventory.put(book, copies - 1);  
            } else {
                System.out.println(book + " is out of stock!");
            }
        }

         
        System.out.println("Current Inventory: " + inventory);
    }
}
