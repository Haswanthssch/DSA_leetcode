public class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int n = values.length;
        int maxScore = Integer.MIN_VALUE;
        int left = values[0];
        for (int j = 1; j < n; j++) {
            maxScore = Math.max(maxScore, left + values[j] - j);
            left = Math.max(left, values[j] + j);
        }
        return maxScore;
    }
}
