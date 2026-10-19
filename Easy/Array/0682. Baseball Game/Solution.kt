class Solution {
    fun calPoints(operations: Array<String>): Int {
        
        val stack = ArrayDeque<Int>()
        var sum = 0

        for(op in operations){
            when(op){

                "+" -> {
                    val last = stack.removeLast()
                    val secondLast = stack.last()
                    val score = last + secondLast

                    stack.addLast(last)
                    stack.addLast(score)
                    sum += score
                }

                "D" -> {
                    val score = 2 * stack.last()

                    stack.addLast(score)
                    sum += score
                }

                "C" -> {
                    sum -= stack.removeLast()
                }

                else -> {
                    val score = op.toInt()
                    
                    stack.addLast(score)
                    sum += score
                }
            }
        }

        return sum
    }
}
