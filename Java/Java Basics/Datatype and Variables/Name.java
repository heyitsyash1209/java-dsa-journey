
 import java.util.Scanner;//pre - Built Package in java that provides classes to perform a Specific task.
//Espicially we used Scanner class is used to take input from the user.
public class Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Taking Input from the User 
        System.out.print("Enter your name: ");
        String name = sc.nextLine();//create String type variable and store the data in Double Quates.
        
        System.out.println("Welcome " + name + "!");//Print Satetment to print the Output in Terminal.
    }
}
 
    

