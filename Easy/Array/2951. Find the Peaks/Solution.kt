class Solution {
    fun findPeaks(mountain: IntArray): List<Int> {
        
        val list = mutableListOf<Int>()

        for(i in 1 until mountain.size - 1){
            if(mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1]){
                list.add(i)
            }
        }

        return list
    }
}
