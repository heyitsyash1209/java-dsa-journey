package Java.Arrayinjava;
public class largestelementinarray {
    public static void main(String args[]) {

        int[] arr = {1, 12, 31, 42};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest element = " + max);
    }
}