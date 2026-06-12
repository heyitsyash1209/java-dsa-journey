// demonstrate unary operator ++ , --
public class main {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3, d = 4, e = 5, f = 6;
        int x = a++ + ++b * c-- - --d + e++ * --f;
        int y = ++a - b++ + --c * d-- + ++e - f++;
        int z = x + y + ++a * --b - c++ + d-- * ++e;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
