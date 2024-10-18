class Solution {
    private int countsubsets(int idx, int curor, int[] nums, int maxOr){
        if(idx == nums.length){
            if(curor == maxOr){
                return 1;
            }
            return 0;
        }
        int taken = countsubsets(idx+1, curor|nums[idx], nums, maxOr);
        int nottaken = countsubsets(idx+1, curor, nums, maxOr);
        return taken + nottaken;
    }
    public int countMaxOrSubsets(int[] nums) {
        int n = nums.length;
        int  MaxOr = 0;
        for(int i : nums){
            MaxOr |= i;
        }
        int curor=0;
        return countsubsets(0, curor, nums, MaxOr);
    }
}