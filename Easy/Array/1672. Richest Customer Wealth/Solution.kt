class Solution {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        
        var ans = 0

        for(account in accounts) {
            ans = maxOf(ans, account.sum())
        }

        return ans
    }
}
