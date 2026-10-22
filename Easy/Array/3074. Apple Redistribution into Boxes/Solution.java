class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {

        int sum = 0;

        for(int item : apple){
            sum += item; 
        }

        int count = 0;

        Arrays.sort(capacity);

        for(int i = capacity.length - 1; i >= 0; i--){

            count++;
            
            sum -= capacity[i];
            if(sum <= 0){
                break;
            }
        }

        return count;
    }
}
