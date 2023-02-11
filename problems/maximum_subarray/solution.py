class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        """the O(n) solution is the easiest, with
        the divide-n-conquer being more subtle""" 
        
        n = len(nums)
        i1, i2, = 0, 0
        curr_sum, max_sum = 0, -10**4
        # O(n) Time approach
        for i, e in enumerate(nums):
            # start subarray if we reach negative nums
            if curr_sum <= 0: 
                curr_sum = e  
                i0 = i # subarray start
            else:             # add element
                curr_sum += e
                
            if curr_sum > max_sum:
                max_sum = curr_sum
                i1, i2 = i0, i + 1
        return max_sum # sum(nums[i1:i2])
