class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        """Lists are passed by reference, not value, so we copy both arrays
        into variables named n, m w/o additional space, it's O(2) space & time
        Time: O(n) where n is the longest array length"""
        from collections import defaultdict

        max_nums, min_nums = nums1, nums2  # assume nums1 the longest array
        if (n := len(nums1)) < (m := len(nums2)):  # reverse if not
            max_nums, min_nums, m, n = nums2, nums1, n, m

        r, d1, d2 = [], defaultdict(int), defaultdict(int)
        for i, e in enumerate(max_nums):
            # register element in 1st arr (e)
            d1[e] += 1
            # register element in 2nd arr (e2) if not finished
            if i < m:
                d2[e2 := min_nums[i]] += 1
                # if this element is in both arr, pop it & add to result
                if d1[e2] and d2[e2]:
                    d1[e2], d2[e2] = d1[e2] - 1, d2[e2] - 1
                    r.append(e2)
            # if e1 is in both arr, pop it & add to result
            if d1[e] and d2[e]:
                d1[e], d2[e] = d1[e] - 1, d2[e] - 1
                r.append(e)

        return r
