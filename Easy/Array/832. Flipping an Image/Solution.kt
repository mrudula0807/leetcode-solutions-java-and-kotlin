class Solution {
    fun flipAndInvertImage(image: Array<IntArray>): Array<IntArray> {
        
        for(row in image){
            val n = row.size

            for(i in 0 until (n + 1) / 2){
                val j = n - 1 - i

                if(i == j){
                    row[i] = row[i] xor 1
                } else {
                    val temp = row[i]
                    row[i] = row[j] xor 1
                    row[j] = temp xor 1
                }
            }
        }

        return image
    }
}
