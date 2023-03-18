class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        """the array is sorted so we can use divide & conquer"""

        lo, hi = 0, len(nums) - 1

        while lo <= hi:
            mid = (hi + lo) // 2
            print(nums[mid])
            # return immediately if target found
            # else keep closing the gap until lo > hi
            if nums[mid] == target:
                return mid
            elif nums[mid] < target:
                lo = mid + 1
            else:
                hi = mid - 1

        return hi + 1

