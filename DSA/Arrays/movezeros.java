class Solution { // 283 move zeros problem in leetcode
    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[index] = nums[i];
                index++;   
            }
        }
           for(int i = index; i < nums.length; i++) {
            nums[index] = 0;
            index++;
        }
        
    }
}   