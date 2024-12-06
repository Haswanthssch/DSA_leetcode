class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> a = new HashSet<>();
        for(int ne : banned){
            a.add(ne);
        }
        int sum = 0, c=0;
        for(int i = 1; i <= n;i++){
            if(!a.contains(i)){
                sum+=i;
                if(sum>maxSum){
                    break;
                }
                c++;
            }
        }
        return c;
    }
}