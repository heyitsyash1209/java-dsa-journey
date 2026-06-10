package DSA.Recursion;
public class naturalnumbers{
    static void p(int n){
        if(n==0){
            return;
        }
         System.out.println(n);
         p(n-1);
         System.out.println(n);
    }
    public static void main(String[] args){
      p(5);  
    }

}