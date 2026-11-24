class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        
        var count = n

        for(i in flowerbed.indices){

            if(count == 0)
                return true

            if(flowerbed[i] == 1){
                continue
            }

            if(i > 0 && flowerbed[i - 1] == 1 ||
                i < flowerbed.size - 1 && flowerbed[i + 1] == 1){
                    continue
            }

            flowerbed[i] = 1
            count--
        }

        return count <= 0
    }
}
