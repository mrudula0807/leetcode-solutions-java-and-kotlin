class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
      
        int[] res = new int[friends.length];
        HashSet<Integer> set = new HashSet<>();
      
        for(int f: friends){
            set.add(f);
        }
      
        int i = 0;
      
        for(int id: order){
            if(set.contains(id)){
                res[i++] = id;
            }
        }
      
        return res;
    }
}
