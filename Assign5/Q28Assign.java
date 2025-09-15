import java.util.*;
import java.util.Map;
import java.util.HashMap;

class Q28Assign {
    public static void main(String[] args) {
        Map<String, List<String>> department = new HashMap<>();

        department.put("IT", Arrays.asList("Amit", "Rohan"));
        department.put("HR", Arrays.asList("Priya"));

        System.out.println("Department Structure:");
        for (Map.Entry<String, List<String>> entry : department.entrySet()) {
            System.out.println(entry.getKey() + ": " + String.join(", ", entry.getValue()));
        }
    }
}
