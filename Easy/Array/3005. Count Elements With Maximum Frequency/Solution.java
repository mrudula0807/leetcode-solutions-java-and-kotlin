class Solution {
    public int maxFrequencyElements(int[] nums) {

        int[] freq = new int[101];
        int max = 0;

        for(int num : nums){
            freq[num]++;
            max = Math.max(max, freq[num]);
        }

        int sum = 0;

        for(int count : freq){
            if(count == max){
                sum += count;
            }
        }

        return sum;
    }
}
