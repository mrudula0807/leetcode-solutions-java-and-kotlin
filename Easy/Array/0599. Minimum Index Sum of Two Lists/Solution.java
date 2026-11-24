class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < list2.length; i++){
            map.put(list2[i], i);
        }

        int least = Integer.MAX_VALUE;
        List<String> res = new ArrayList<>();

        for(int i = 0; i < list1.length; i++){

            Integer j = map.get(list1[i]);

            if(j == null){
                continue;
            }
            
            int sum = i + j;

            if(sum < least){
                least = sum;
                res.clear();
                res.add(list1[i]);
            } else if(sum == least){
                res.add(list1[i]);
            }
        }

        return res.toArray(new String[0]);
    }
}
