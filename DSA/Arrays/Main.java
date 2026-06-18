package DSA.Arrays;

import java.util.*;
public class Main {
    static long n, k;
    static boolean check(long v) {
        long sum = 0;
        long cur = v;
        while (cur > 0) {
            sum += cur;
            cur /= k;
        }
        return sum >= n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        k = sc.nextLong();
        long l = 1, r = n, ans = n;
        while (l <= r) {
            long mid = (l + r) / 2;

            if (check(mid)) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        System.out.println(ans);
    }
}