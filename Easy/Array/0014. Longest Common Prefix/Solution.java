class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {

            String curr = strs[i];
            int j = 0;
            int len = Math.min(prefix.length(), curr.length());

            while (j < len && prefix.charAt(j) == curr.charAt(j)) {
                j++;
            }

            prefix = prefix.substring(0, j);
            
            if (prefix.isEmpty()) 
                return "";
        }

        return prefix;
    }
}
