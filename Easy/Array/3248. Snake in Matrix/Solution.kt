class Solution {
    fun finalPositionOfSnake(n: Int, commands: List<String>): Int {
        
        var next = 0

        for(command in commands){
            
            when(command){

                "UP" -> next -=n
                "DOWN" -> next += n             
                "LEFT" -> next--              
                "RIGHT" -> next++
            }
        }

        return next
    }
}
