//Code Foreces ---> A New Year Garland Problem
import java.util.Scanner;
public class codeA{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        
        int largest = 0;
        int sum = 0;
        
        if(n1 >= n2 && n1 >= n3 ){
            largest = n1;
            sum = n2 + n3;
        }
        else if(n2 >= n1 && n2 >= n3){
            largest = n2;
            sum = n1 + n3;
        }
        else{
           largest = n3;
           sum = n1 + n2;
        }
        
        if(largest < sum + 1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    }
}
    
