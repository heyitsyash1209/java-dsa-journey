// find frequency using Arrays
package DSA.Arrays;
public class frequencyArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,1,2,3,4};
        int[] freq = new int[5];
        for(int num : arr){
               freq[num]++;
        }
          for(int i = 0; i < freq.length; i++){
                if(freq[i] > 0){
                    System.out.println(i + " -> " + freq[i]);
            }
        }
    }
}
