package DSA.Sorting;
import java.util.Arrays;
public class selectionsort{
    public static void main(String args[]){
        int[] arr = {5,1,4,2,3};
        int n = arr.length;
        for(int i = 0; i < n-1;i++){
            int val = arr[i];
            int min_index = i;
            for(int j = i+1; j < n; j++){
                if(val > arr[j]){
                   val = arr[j];
                   min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
       
        System.out.print(Arrays.toString(arr));
    }
}