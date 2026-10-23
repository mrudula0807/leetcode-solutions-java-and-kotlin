class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        int smallerCount = 0;
        int targetCount = 0;

        for(int num : nums){
            if(num < target){
                smallerCount++;
            } else if(num == target){
                targetCount++;
            }
        }
        
        List<Integer> list = new ArrayList<>();

        for(int i = smallerCount; i < smallerCount + targetCount; i++){
            list.add(i);
        }

        return list;
    }
}
