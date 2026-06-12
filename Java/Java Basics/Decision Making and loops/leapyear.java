import java.util.Scanner;
public class leapyear {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a year");
        int num = sc.nextInt();
        if((num % 4 == 0 && num % 100 != 0) || (num%400==0)){
            System.out.println(+num+ "  : leap year");
        }
        else{
            System.out.println(+num+" : not leap year");
        }

    }

}
