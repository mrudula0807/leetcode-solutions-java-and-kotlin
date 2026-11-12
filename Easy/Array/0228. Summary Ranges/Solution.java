class Solution {
    public List<String> summaryRanges(int[] nums) {

        List<String> ranges = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){

            int start = nums[i];

            while(i + 1 < nums.length && nums[i + 1] == nums[i] + 1){
                i++;
            }

            int end = nums[i];

            if(start == end){
                ranges.add(String.valueOf(start));
            } else {
                ranges.add(start + "->" + end);
            }
        }

        return ranges;
    }
}
