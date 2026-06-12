package DSA.Arrays;
//codeforces ----> Qualaity and Quantity
import java.util.*;
public class QandQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            Arrays.sort(a);

            long blue = a[0] + a[1];
            long red = a[n - 1];

            int i = 2;
            int j = n - 2;

            boolean ok = false;

            while (i < j) {
                if (red > blue) {
                    ok = true;
                    break;
                }
                blue += a[i++];
                red += a[j--];
            }
            if (red > blue) ok = true;
            System.out.println(ok ? "YES" : "NO");
        }
    }
}