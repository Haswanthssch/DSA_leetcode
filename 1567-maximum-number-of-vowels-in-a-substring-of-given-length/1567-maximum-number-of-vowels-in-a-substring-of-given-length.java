class Solution {
    public int maxVowels(String s, int k) {
        int left = 0, right = 0, v = 0, maxv = 0;
        for (right = 0; right < k; right++) {
            if (isVowel(s.charAt(right))) {
                v++;
            }
        }
        maxv = v;
        while (right < s.length()) {
            if (isVowel(s.charAt(left))) {
                v--;
            }
            if (isVowel(s.charAt(right))) {
                v++;
            }
            left++;
            right++;
            maxv = Math.max(maxv, v);
        }
        return maxv;
    }
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
