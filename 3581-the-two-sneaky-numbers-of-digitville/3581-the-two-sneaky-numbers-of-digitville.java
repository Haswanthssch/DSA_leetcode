class Solution {
    public int[] getSneakyNumbers(int[] nums) {
       Arrays.sort(nums);
       int[] n = new int[2];
       int j = 0;
       for(int i = 0 ; i < nums.length - 1 ; i++){
        if(nums[i] == nums[i + 1]){
            n[j] = nums[i];
            j++;
        }
       }
       return n; 
    }
}