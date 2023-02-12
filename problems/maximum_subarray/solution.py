class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        """The O(n) aproach was easier, this is a subsequent exercise
        using the divide-and-conquer approach...
        T(n) = 2T(n/2) + O(n) -> O(n) = O(nlogn)"""

        @staticmethod
        def _maxSubArray(arr: List[int], i_left: int, i_right: int) -> int:
            """We redo the function to be able to use recurrence"""
            if i_left > i_right:
                return -inf
            mid: int = (i_left + i_right) // 2  # floor division returns int
            # iterate over n/2
            left_sum, cur_sum = 0, 0
            for i in range(mid - 1, i_left - 1, -1):
                left_sum = max(left_sum, cur_sum := cur_sum + arr[i])
            # iterate right over n/2
            cur_sum, right_sum = 0, 0
            for e in arr[mid + 1:i_right + 1]:
                right_sum = max(right_sum, cur_sum := cur_sum + e)

            return max(
                _maxSubArray(arr, i_left, mid - 1),
                _maxSubArray(arr, mid + 1, i_right),
                left_sum + arr[mid] + right_sum,
            )

        # use recurrence until we get the max subarray sum
        return _maxSubArray(nums, 0, len(nums) - 1)
