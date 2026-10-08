class Solution {
    public int countSeniors(String[] details) {
        
        int count = 0;

        for(String person : details){
            int age = (person.charAt(11) - '0') * 10
                + (person.charAt(12) - '0');
            if(age > 60)
                count++;
        }

        return count;
    }
}
