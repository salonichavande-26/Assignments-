/*Problem 5: Recent Search History 
Use Case: A search application maintains the last 5 searches, removing the oldest when the limit is 
exceeded. 
Requirements: 
● Store recent searches (maximum 5) 
● Remove oldest search when limit exceeded 
● Maintain insertion order 
Sample Input: 
Searches: "Java", "Python", "C++", "DSA", "OOP", "Spring" 
Expected Output: 
Recent searches: Python, C++, DSA, OOP, Spring */

import java.util.LinkedList;
import java.util.Queue;

class Q5Assign {
    public static void main(String[] args) {
        Queue<String> searches = new LinkedList<>();

         
        String[] input = {"Java", "Python", "C++", "DSA", "OOP", "Spring"};

        for (String s : input) {
            if (searches.size() == 5) {
                searches.poll();  
            }
            searches.add(s);  
        }

        System.out.print("Recent searches: ");
        int count = 0;
        for (String s : searches) {
            System.out.print(s);
            count++;
            if (count < searches.size()) {
                System.out.print(", ");  
            }
        }
        System.out.println();
    }
}
