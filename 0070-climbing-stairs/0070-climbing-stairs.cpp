#include <vector>
using namespace std;

class Solution {
public:
    int climbStairs(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        
        vector<int> steps(n + 1);
        steps[0] = 1;
        steps[1] = 1;
        
        for (int i = 2; i <= n; ++i) {
            steps[i] = steps[i - 1] + steps[i - 2];
        }
        
        return steps[n];
    }
};
