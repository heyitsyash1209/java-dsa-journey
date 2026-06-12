package DSA.Arrays;
//code forces --> 158-A
import java.util.Scanner;

public class nextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int cut = arr[k - 1]; 
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= cut && arr[i] > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}