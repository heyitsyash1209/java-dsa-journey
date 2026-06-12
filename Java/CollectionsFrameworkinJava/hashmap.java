package Java.CollectionsFrameworkinJava;

import java.util.HashMap;

public class hashmap{
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        // Add elements
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");

        // Access elements
        System.out.println(map.get(2)); // Banana

        // Print all key-value pairs
        for (int key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}