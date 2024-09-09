class Solution {
    public int countGoodSubstrings(String s) {
        int left = 0, right = 3, c = 0;
        while(right < s.length()+1
        ){
            Set<Character> set = new HashSet<>();
            for(int i = left; i<right; i++)
            set.add(s.charAt(i));
            if(set.size() == 3)
            c++;
            left++;
            right++;
        }
        return c;
    }
}