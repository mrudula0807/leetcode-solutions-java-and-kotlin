class Solution {
    public int calPoints(String[] operations) {
        
        Deque<Integer> score = new ArrayDeque();
        int sum = 0;

        for(String op : operations){

            switch(op){
                case "+" -> {
                    int last = score.pop();
                    int secondLast = score.peek();
                    int newScore = last + secondLast;

                    score.push(last);
                    score.push(newScore);
                    sum += newScore;
                }
                    
                case "D" -> {
                    int newScore = 2 * score.peek();
                    score.push(newScore);
                    sum += newScore;
                }

                case "C" ->{
                    sum -= score.pop();
                }

                default -> {
                    int newScore = Integer.parseInt(op);
                    score.push(newScore);
                    sum += newScore;
                }
            }
        }

        return sum;
    }
}
