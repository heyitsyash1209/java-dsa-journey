package DSA.Linkedlist;
import java.util.*;
import java.util.LinkedList;
public class SearchinginLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            ll.add(sc.nextInt());
        }
        int key = sc.nextInt();
        boolean found = false;
        for (int x : ll) {
            if (x == key) {
                found = true;
                break;
            }
        }

        System.out.println("elemnt : " + key + " " + found);

    }
}