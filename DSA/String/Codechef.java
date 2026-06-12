package DSA.String;
import java.util.*;
class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String a = sc.next();
            String b = sc.next();
            int i = 0;
            while (i < n && i < m && a.charAt(i) == b.charAt(i)) {
                System.out.print(a.charAt(i));
                i++;
            }
            System.out.println();
        }
    }
}