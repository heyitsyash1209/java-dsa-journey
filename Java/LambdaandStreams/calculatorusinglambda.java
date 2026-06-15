
import java.util.Scanner;
interface Calculation {
    int operate(int a, int b);
}
public class calculatorusinglambda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter First number : ");
        int a = sc.nextInt(); 
        System.out.print("enter Second number : ");
        int b = sc.nextInt();
        try {
        Calculation add = (x, y) -> x + y;
        Calculation sub = (x, y) -> x - y;
        Calculation multiply = (x, y) -> x * y;
        Calculation divide = (x, y) -> x / y;
        System.out.println("Addition: " + add.operate(a, b));
        System.out.println("Subtraction: " + sub.operate(a, b));
        System.out.println("Multiplication: " + multiply.operate(a, b));
        System.out.println("Division: " + divide.operate(a, b));
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }  
    }
}
