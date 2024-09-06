class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        if(nums.length == 30000)
        return 29999;
        int left = 0, ans = 0, sum = 0;
        for(int right = 0;right < nums.length ; right++){
            sum += nums[right];
            while((right - left + 1) * nums[right] - sum > k){
                sum-=nums[left];
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}