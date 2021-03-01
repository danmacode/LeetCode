from typing import Dict, List
import itertools as it
class Solution:
    def minOperations(self, boxes: str) -> List[int]:

        d: Dict[int, int] = {i: 0 for i in range(len(boxes))}

        for i in range(0, len(boxes)):
            for j, c in enumerate(boxes):
                if c == "1":
                    d[i] += abs(i - j)
    
        return list(d.values())