class Solution {
public:

    vector<int> resultsArray(vector<int>& nums, int k) {
        vector<int> ans;
        if(nums.size()==1)
        {
            ans.push_back(nums[0]);
            return ans;
        }
        if(k==1)
        return nums;
        int n=nums.size();
        int l=0,r=k-1;
        while(r<n){
            bool t=true;
            for(int i=l;i<r;i++){
                if(nums[i+1]!=nums[i]+1){
                t=false;
                break;
                }
            }
            if(t)
            ans.push_back(nums[r]);
            else
            ans.push_back(-1);
            l++;
            r++;
        }
        return ans;
    }
};