import java.util.Arrays;

class Solution {
    
    private boolean canDistribute(int mid, int[] quantities, int n){
        for (int x : quantities) {
            n -= (x + mid - 1) / mid;
            if (n < 0) {
                return false;
            }
        }
        return true;
    }
    
    public int minimizedMaximum(int n, int[] quantities) {
        if (n == 0 || quantities == null || quantities.length == 0) {
            return 0;
        }
        
        int l = 1, r = Arrays.stream(quantities).max().getAsInt();
        int result = r;
        
        while (l <= r) {
            int mid = l + (r - l) / 2;
            
            if (canDistribute(mid, quantities, n)) {
                result = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        
        return result;
    }
}
