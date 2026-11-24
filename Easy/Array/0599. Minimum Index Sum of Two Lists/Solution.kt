class Solution {
    fun findRestaurant(list1: Array<String>, list2: Array<String>): Array<String> {
        
        val indexMap = list2.withIndex().associate {
            it.value to it.index
        }

        val list = mutableListOf<String>()
        var least = Int.MAX_VALUE

        for(i in list1.indices){

            val j = indexMap[list1[i]] ?: continue
            val sum = i + j

            if(sum < least){
                least = sum
                list.clear()
                list.add(list1[i])
            } else if(sum == least) {
                list.add(list1[i])
            }            
        }

        return list.toTypedArray()
    }
}
