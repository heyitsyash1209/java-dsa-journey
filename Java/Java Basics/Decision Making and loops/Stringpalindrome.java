public class Stringpalindrome {
    public static void main(String args[]) {

        String str = "yash";

        StringBuilder sb = new StringBuilder(str);
        String reversed = sb.reverse().toString();

        System.out.println("Reversed string: " + reversed);

        if (str.equals(reversed)) {
            System.out.println("This string is palindrome");
        } else {
            System.out.println("This string is not palindrome");
        }
    }
}