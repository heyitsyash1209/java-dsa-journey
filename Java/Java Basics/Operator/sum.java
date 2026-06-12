import java.util.*;
public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        int sum1 = num1 - num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        int sum3 = num1 * num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        int sum4 = num1 / num2;
        if(num2 != 0){
            System.out.println("not divided by zero");
        }
        else{
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        }
    }
}