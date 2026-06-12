import java.util.Scanner;
public class posnum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int count = 0;
        while( n > 0 ){
            int digits = n % 10;
            count = count + digits;
            n /= 10; 
        }
        System.out.println(count);
        if(count % 5 == 0 && count % 6 == 0){
            System.out.println("yes");
        }
        else if(count % 6 == 0){
            System.out.println("maybe");
        }
        else if(count % 5 == 0){
            System.out.println("no");
        }
        else{
            System.out.println("invalid");
        }
    }
}
