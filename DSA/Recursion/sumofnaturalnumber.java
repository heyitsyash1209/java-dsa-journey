package DSA.Recursion;
public class sumofnaturalnumber{
    static int p(int n){
        if(n==0){
            return 0;
        }
         
        return p(n-1) + n;
    }
    public static void main(String[] args){  
      System.out.println(p(10));
    }

}