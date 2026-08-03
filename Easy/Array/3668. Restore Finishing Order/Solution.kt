class Solution {
    fun recoverOrder(order: IntArray, friends: IntArray): IntArray {

        val res = IntArray(friends.size)
        val set = friends.toHashSet()

        var index = 0
        
        for(id in order) {
            if(id in set) {
                res[index++] = id
            }
        }

        return res
    }
}
