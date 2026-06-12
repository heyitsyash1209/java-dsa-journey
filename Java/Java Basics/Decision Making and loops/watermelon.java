//Competetive Programming Problem ---->  Watermelon-4A by Codeforces 
import java.util.Scanner;
public class watermelon {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a weight of watermelon");
        float w = sc.nextFloat();
        
         if( w > 2 && w % 2 == 0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
    
}
