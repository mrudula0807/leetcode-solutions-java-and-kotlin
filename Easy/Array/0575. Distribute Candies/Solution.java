class Solution {
    public int distributeCandies(int[] candyType) {

        int limit = candyType.length / 2;
        Set<Integer> set = new HashSet<>();

        for(int type : candyType){
            set.add(type);

            if(set.size() == limit){
                return limit;
            }
        }

        return set.size();
    }
}
