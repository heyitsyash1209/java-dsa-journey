import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int num = sc.nextInt();

        // consume leftover newline
        sc.nextLine();

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter a decimal number: ");
        double d = sc.nextDouble();

        // output (optional but good)
        System.out.println("\n--- Output ---");
        System.out.println("Number: " + num);
        System.out.println("Name: " + name);
        System.out.println("Decimal: " + d);
    }
}