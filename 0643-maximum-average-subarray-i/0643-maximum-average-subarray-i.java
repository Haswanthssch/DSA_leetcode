class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length, sum = 0;
        for(int i = 0 ; i < k ; i++){
            sum +=nums[i];
        }
        double MaxSum = sum;
        int left = 0, right = k;
        while(right < n){
            sum -= nums[left++];
            sum += nums[right++];
            MaxSum = Math.max(MaxSum,sum);
        }
        return MaxSum/k;
    }
}