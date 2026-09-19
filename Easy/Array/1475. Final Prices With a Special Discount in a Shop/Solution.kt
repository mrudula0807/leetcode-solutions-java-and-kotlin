class Solution {
    fun finalPrices(prices: IntArray): IntArray {
        
        val n = prices.size
        val answer = prices.copyOf()

        for(i in 0 until n){
            for(j in i + 1 until n){
                if(prices[j] <= prices[i]){
                    answer[i] -= prices[j]
                    break
                }
            }
        }
        
        return answer
    }
}
