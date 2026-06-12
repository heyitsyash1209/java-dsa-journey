package DSA.Arrays;
//Product of Array Except Self
import java.util.Arrays;
public class productarray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int c = 0;
        int n = a.length;
        int in = -1;
        int mul = 1;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                c++;
                in = i;
            } else {
                mul *= a[i];
            }
        }
        if (c > 1) {
            Arrays.fill(a, 0);
        } 
        else if (c == 1) {
            a[in] = mul;
            for (int i = 0; i < n; i++) {
                if (i != in) {
                    a[i] = 0;
                }
            }
        } 
        else {
            for (int i = 0; i < n; i++) {
                a[i] = mul / a[i];
            }
        }

        System.out.println(Arrays.toString(a));
    }
}