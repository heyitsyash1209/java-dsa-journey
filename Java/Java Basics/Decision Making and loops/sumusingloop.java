import java.util.*;
public class sumusingloop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i <= n; i+=2){
                sum+=i;
        }
        System.out.println("sum:" +sum);
          
    }
}
