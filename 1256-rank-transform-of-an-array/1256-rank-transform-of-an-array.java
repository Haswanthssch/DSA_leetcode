class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] b = arr.clone();
        Arrays.sort(b);
        int a[] = new int[arr.length];
        HashMap<Integer, Integer> ans = new HashMap<>();
        int rank = 1;
        for(int i : b){
            if (!ans.containsKey(i))
            ans.put(i, rank++);
        }
        for(int i = 0 ; i < arr.length ; i++){
            a[i] = ans.get(arr[i]);
        }
        return a;
    }
}