
package DSA.Recursion;
public class multiplication {
    static void p(int n, int i) {
        if (i > 10) {
            return;
        }

        System.out.println(n * i);
        p(n, i + 1);
    }

    public static void main(String[] args) {
        p(5, 1);
    }
}