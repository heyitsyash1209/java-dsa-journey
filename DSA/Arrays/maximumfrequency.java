package DSA.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public class maximumfrequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 2, 3};
        HashMap<String, Integer> map = new HashMap<>();
        map.put("yash", 12);
        map.put("apoorva", 11);
        map.put("arjab", 10);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int val : arr) {
            freqMap.put(val, freqMap.getOrDefault(val, 0) + 1);
        }
        System.out.println(freqMap);
        int max = Collections.max(map.values());
        System.out.println("Max value in map = " + max);
        int maxFreq = Collections.max(freqMap.values());
        System.out.println("Max frequency = " + maxFreq);
    }
}