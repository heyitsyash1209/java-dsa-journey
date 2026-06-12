import java.util.Scanner;
public class greatest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number");
        int n1 = sc.nextInt();
        System.out.println("enter a second number");
        int n2 = sc.nextInt();
        System.out.println("enter a third number");
        int n3 = sc.nextInt();
        if(n1>n2 && n1>n3){
            System.out.println("n1 is greater");
        }
        else if(n2>n3){
            System.out.println("n2 is greater");
        }
        else {
            System.out.println("n3 is graeter");
        }
    }
}
