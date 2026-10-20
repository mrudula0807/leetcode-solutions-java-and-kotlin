class Solution {
    fun countTestedDevices(batteryPercentages: IntArray): Int {
        
        var count = 0

        for(perc in batteryPercentages){
            if(perc > count){
                count++
            }
        }

        return count
    }
}
