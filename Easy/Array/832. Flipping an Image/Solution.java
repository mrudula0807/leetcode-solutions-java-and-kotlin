class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        for(int[] row : image){
            int n = row.length; 

            for(int i = 0; i < (n + 1) / 2; i++){
                int j = n - 1 - i;

                int temp = row[i];
                row[i] = row[j] ^ 1;
                row[j] = temp ^ 1;
            }
        }

        return image;
    }
}
