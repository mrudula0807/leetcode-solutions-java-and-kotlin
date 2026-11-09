class Solution {
    fun maxProfit(prices: IntArray): Int {
        
        var minPrice = prices[0]
        var maxProfit = 0

        for(i in 1 until prices.size){
            minPrice = minOf(minPrice, prices[i])
            val currentProfit = prices[i] - minPrice

            maxProfit = maxOf(maxProfit, currentProfit)
        }

        return maxProfit
    }
}
