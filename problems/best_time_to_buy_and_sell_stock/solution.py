class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        """Finds maximum profit in any transaction between `prices`.
        The naive approach would have 2 nested for loops O(n²),

        This can do it in O(n)"""
        max_profit = 0
        min_p = 10**4
        for _, e in enumerate(prices):
            if e < min_p:
                min_p = e
            elif e - min_p > max_profit:
                max_profit = (max_p := e) - min_p
        # returns 0 if no profitable tx found
        return max_profit
