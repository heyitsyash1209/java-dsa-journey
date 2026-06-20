package DSA.Arrays;

class Solution {
    public int countDigits(int num) {
        int count = 0;
        int t = num ;
        while(t!=0){
            int digits = t % 10;

            if(num % digits == 0){
                count++;
            }
            t /= 10;
        }
        return count;
    }
}
