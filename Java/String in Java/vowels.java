import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next().toUpperCase();
        int count = 0;
        System.out.print("Vowels: ");
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
                System.out.print(ch + " ");
            }
        }
        System.out.println("Count = " + count);
    }
}