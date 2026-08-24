class Solution {
    fun stableMountains(height: IntArray, threshold: Int): List<Int> {
        
        val stable = mutableListOf<Int>()

        for(i in 1 until height.size){
            if(height[i - 1] > threshold) {
                stable.add(i)
            }
        }

        return stable
    }
}
