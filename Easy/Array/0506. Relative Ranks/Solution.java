class Solution {
    public String[] findRelativeRanks(int[] score) {
        
        Integer[] indices = new Integer[score.length];

        for(int i = 0; i < score.length; i++){
            indices[i] = i;
        }

        Arrays.sort(indices, (a, b) -> Integer.compare(score[b], score[a]));

        String[] answer = new String[score.length];

        for(int i = 0; i < indices.length; i++){

            int index = indices[i];
            int rank = i + 1;

            if(rank == 1){
                answer[index] = "Gold Medal";
            } else if(rank == 2) {
                answer[index] = "Silver Medal";
            } else if(rank == 3) {
                answer[index] = "Bronze Medal";
            } else {
                answer[index] = String.valueOf(rank);
            }
        }

        return answer;
    }
}
