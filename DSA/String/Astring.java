//code forces --->A. String Task
package DSA.String;
import java.util.*;
public class Astring{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        String st = sc.next().toLowerCase();
        StringBuilder a = new StringBuilder();

        for(int i = 0; i < st.length();i++){
            char s = st.charAt(i);
            if(s != 'a' && s != 'o' && s != 'y' && s != 'e'&& s != 'u' && s != 'i' ){
                a.append('.').append(s);

            }

        }
        System.out.println(a);

    }
}
