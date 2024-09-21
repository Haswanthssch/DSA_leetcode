class Solution {
public:
    std::vector<int> lexicalOrder(int n) {
        std::vector<int> ans;
        for (int i = 1; i <= n; i++) {
            ans.push_back(i); // Push integers directly
        }
        std::sort(ans.begin(), ans.end(), [](int a, int b) {
            return std::to_string(a) < std::to_string(b); // Sort based on string representation
        });
        return ans;
    }
};
