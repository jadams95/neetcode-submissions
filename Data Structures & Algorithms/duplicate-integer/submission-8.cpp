// #include <set>
// #include <vector>
// using namespace std;

class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        set<int> seenNums;  // No 'new', no size needed

        for (int num : nums) {
            if (seenNums.count(num) == 0) {  // Not found
                seenNums.insert(num);         // Use insert(), not put()
            } else {
                return true;   // Duplicate found!
            }
        }
        return false;  // Move outside the loop - no duplicates
    }
};