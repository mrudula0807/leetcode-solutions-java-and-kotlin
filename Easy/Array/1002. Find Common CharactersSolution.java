class Solution {
    public List<String> commonChars(String[] words) {
        int[] minFreq = new int[26];

        // Initialize with first word
        for (char c : words[0].toCharArray()) {
            minFreq[c - 'a']++;
        }

        // Compare with remaining words
        for (int i = 1; i < words.length; i++) {
            int[] currFreq = new int[26];
            for (char c : words[i].toCharArray()) {
                currFreq[c - 'a']++;
            }

            for (int j = 0; j < 26; j++) {
                minFreq[j] = Math.min(minFreq[j], currFreq[j]);
            }
        }

        // Build result
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            while (minFreq[i]-- > 0) {
                result.add(String.valueOf((char) ('a' + i)));
            }
        }

        return result;
    }
}
