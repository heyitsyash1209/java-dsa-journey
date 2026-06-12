package DSA.Stack;
import java.util.Stack;

public class nameadd {
    public static void main(String[] args) {
        Stack <String> str = new Stack<>();
        str.push("Yash");
        str.push("Arjab");
        str.push("Apoorva");
        System.out.println(str);
        System.out.println(str.peek());
        str.pop();
        str.add(0,"Apoorva");
        System.out.println(str);
        str.remove(1);
        System.out.println(str);
        System.out.println(str.size());
        System.out.println(str.peek());



        }
}
