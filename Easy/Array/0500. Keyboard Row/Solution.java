class Solution {
    public String[] findWords(String[] words) {

        String[] keys = new String[] { "qwertyuiop", "asdfghjkl", "zxcvbnm" }; 

        List<String> list = new ArrayList<>();

        for(String word : words){
            
            String w = word.toLowerCase();

            for(String key : keys){

                boolean isValid = true;

                for(char c : w.toCharArray()){
                    if(key.indexOf(c) < 0){
                        isValid = false;
                        break;
                    }
                }

                if(isValid){
                    list.add(word);
                    break;
                }
            }
        }

        return list.toArray(new String[0]);
    }
}
