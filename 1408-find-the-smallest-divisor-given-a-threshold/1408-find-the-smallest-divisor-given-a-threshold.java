class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1, right = Integer.MAX_VALUE;
        int result = right;
        while(left <= right){
            int mid = left + (right - left) / 2;
            int sum = 0;
            for(int n : nums){
                sum += (n + mid - 1) / mid;
            }
            if(sum <= threshold){
                result = mid;
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return result;
    }

}