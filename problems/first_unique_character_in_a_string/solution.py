class Solution:
    def firstUniqChar(self, s: str) -> int:
        """Trying to improve my previous submission
        I use an ordered defaultdict O(m) size
        A loop O(n) time, second loop O(m) time
        n = length of str, m = unique letters in str"""

        from collections import defaultdict
        seen = defaultdict(lambda: [0] * 2)
         
        # O(n) time
        for i in range(n := len(s)):
            # add letter to seen dict
            seen[letter:=s[i]][0] += 1 # seen times
            seen[letter:=s[i]][1] = i # 1st position
        # O(m) time, size of dict = O(m)x2
        for k in seen:
            if seen[k][0] == 1: # if unique
                return seen[k][1] # return 1st pos

        return -1