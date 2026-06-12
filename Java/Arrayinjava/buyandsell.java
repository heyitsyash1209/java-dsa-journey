package Java.Arrayinjava;
import java.util.Scanner;

public class buyandsell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // size of array
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int sum = 0;
        int left = 0;

        // Total sum
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }

        // Find pivot index
        int pivot = -1;
        for (int i = 0; i < n; i++) {
            if (left == sum - left - nums[i]) {
                pivot = i;
                break;
            }
            left += nums[i];
        }

        System.out.println(pivot);
    }
}