class Solution {
    fun largestAltitude(gain: IntArray): Int {
        
        var altitude = 0
        var highest = 0

        for(current in gain){
            altitude += current
            highest = maxOf(highest, altitude)
        }

        return highest
    }
}
