class Solution {
public:
    int findMinDifference(vector<string>& timePoints) {
        int n = timePoints.size();
        vector<int> ans(n);
        for(int i = 0 ; i < n ; i++){
            int a = stoi(timePoints[i].substr(0,2));
            int m = stoi(timePoints[i].substr(3));
            ans[i] = (a * 60 + m);
        }
        sort(ans.begin(),ans.end());
        int b = INT_MAX;
        for(int i = 0 ; i < n-1 ; i++){
            b = min
            (b, ans[i+1] - ans[i]);
        }
        return min(b, 24 * 60 - ans[ans.size() - 1] + ans[0]);
    }
};