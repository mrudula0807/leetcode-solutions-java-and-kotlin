class Solution {
    fun minimumBoxes(apple: IntArray, capacity: IntArray): Int {
        
        var total = apple.sum()

        capacity.sortDescending()

        var count = 0

        for(k in capacity){
            count++
            
            total -= k
            if(total <= 0){
                break
            }
        }

        return count
    }
}
