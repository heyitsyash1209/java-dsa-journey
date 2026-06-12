package DSA.Linkedlist;

import java.util.Scanner;
import java.util.LinkedList;

public class insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        LinkedList<Integer> LL = new LinkedList<>();

        for(int i = 0; i < n; i++) {
            LL.add(sc.nextInt());
        }

        System.out.println(LL);
    }
}