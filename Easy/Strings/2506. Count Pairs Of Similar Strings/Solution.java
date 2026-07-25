class Solution {
    public int similarPairs(String[] words) {

        HashSet<Character>[] sets = new HashSet[words.length];

        for(int i = 0; i < words.length; i++){
            
            sets[i] = new HashSet<>();

            for(char c : words[i].toCharArray()){
                sets[i].add(c);
            }
        }

        int count = 0;
        
        for(int i = 0; i < words.length; i++){

            for(int j = i + 1; j < words.length; j++){

                if(sets[i].equals(sets[j])){
                    count++;
                }
            } 
        }

        return count;
    }
}
