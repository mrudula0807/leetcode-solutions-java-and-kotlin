class Solution {
    public int[] numberOfPairs(int[] nums) {
        
        int pair = 0;
        int leftover = 0;

        int[] count = new int[101];

        for(int num :  nums){
            count[num]++;
        }

        for(int i = 0; i <= 100; i++){
            pair += count[i] / 2;
            leftover += count[i] % 2;
        }

        return new int[] {pair, leftover};
    }
}
