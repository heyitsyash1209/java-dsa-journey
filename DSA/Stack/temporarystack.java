package DSA.Stack;
import java.util.Stack;
public class temporarystack {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        System.out.println(st.peek());
        Stack <Integer> temp = new Stack<>();
        temp.push(st.pop());
        temp.push(st.pop());
        temp.push(st.pop());
        temp.push(st.pop());
        System.out.println(temp);
        System.out.println(temp.peek());


    }
}
