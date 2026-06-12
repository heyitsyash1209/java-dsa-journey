package Java.CollectionsFrameworkinJava;

import java.util.HashSet;

public class duplicacy {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 20};

        HashSet<Integer> set = new HashSet<>();

        boolean hasDuplicate = false;

        for (int num : arr) {
            if (set.contains(num)) {
                hasDuplicate = true;
                break;
            }
            set.add(num);
        }

        System.out.println(hasDuplicate);
    }
}