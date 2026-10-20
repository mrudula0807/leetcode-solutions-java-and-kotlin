class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        
        int count = 0;

        for(int perc : batteryPercentages){
            if(perc > count){
                count++;
            }
        }

        return count;
    }
}
