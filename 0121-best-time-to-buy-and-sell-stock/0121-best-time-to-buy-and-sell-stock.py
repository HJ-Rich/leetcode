class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        min_price = prices[0]
        max_profit = 0

        for p in prices:
            min_price = min([min_price, p])
            max_profit = max([p - min_price, max_profit])

        return max_profit