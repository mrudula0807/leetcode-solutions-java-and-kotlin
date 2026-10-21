class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        
        int sum = 0;
        int[] freq = new int[101];

        for(int num : nums){
            freq[num]++;
        }

        for(int i = 1; i <= 100; i++){
            int n = freq[i];
            if(n % k == 0){
                sum += (i * n);
            }
        }

        return sum;
    }
}
