class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        
        int xor = 0;

        int[] freq = new int[51];

        for(int num : nums){
            freq[num]++;
        }

        for(int i = 1; i <= 50; i++){
            if(freq[i] == 2){
                xor ^= i;
            }
        }

        return xor;
    }
}
