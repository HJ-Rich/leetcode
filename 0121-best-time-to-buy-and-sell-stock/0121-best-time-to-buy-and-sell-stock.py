class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        min_price = prices[0]
        max_profit = 0

        for p in prices:
            min_price = p if p < min_price else min_price
            profit = p - min_price
            max_profit = profit if profit > max_profit else max_profit

        return max_profit