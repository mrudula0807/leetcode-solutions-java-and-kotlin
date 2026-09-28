class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
        int[] ans = new int[2];
        int n = grid.length;
        int[] freq = new int[n * n + 1];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int num = grid[i][j];
                if(freq[num] > 0){
                    ans[0] = num;
                } else {
                    freq[num]++;
                }
            }
        }

        for(int i = 1; i <= (n * n); i++){
            if(freq[i] == 0){
                ans[1] = i;
                break;
            }
        }

        return ans;
    }
}
