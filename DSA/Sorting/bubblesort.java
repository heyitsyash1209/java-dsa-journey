package DSA.Sorting;
import java.util.Arrays;
public class bubblesort {
    public static void main(String args[]){
        int[] arr = {9,8,7,6,5,4,3,2,1};
int n = arr.length;

for (int i = 0; i < n - 1; i++) {
    int count = 0;

    for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
            count++; 
        }
    }
    if (count == 0) {
        break;         
    }
}
System.out.println(Arrays.toString(arr));
    }
    }

