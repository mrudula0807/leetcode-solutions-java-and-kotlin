class Solution {
    public int earliestTime(int[][] tasks) {
        
        int minTime = Integer.MAX_VALUE;

        for(int[] task : tasks){
            int finishTime = task[0] + task[1];
            minTime = Math.min(minTime, finishTime);
        }

        return minTime;
    }
}
