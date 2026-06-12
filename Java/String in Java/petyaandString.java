import java.util.Scanner;

public class petyaandString {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine().toLowerCase();
        String str2 = sc.nextLine().toLowerCase();

        for (int i = 0; i < str1.length(); i++) {

            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);

            if (c1 < c2) {
                System.out.println("-1");
                return;
            }
            else if (c1 > c2) {
                System.out.println("1");
                return;
            }
            else{
                System.out.println("0");
            }
        }
    }
}