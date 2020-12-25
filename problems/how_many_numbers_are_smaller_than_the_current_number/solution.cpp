class Solution {
public:
    vector<int> smallerNumbersThanCurrent(vector<int>& nums) {
        auto size = nums.size();
        std::vector<int> r(size);
        for (int i = 0; i < size; ++i)
            for (int j = 0; j < size; ++j)
                if (nums[j] < nums[i])
                    r[i] += 1;
        return r;
    }
};