class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        mem_set = set()
        for e in nums:
            if e in mem_set:
                return True
            else:
                mem_set.add(e)
        return False