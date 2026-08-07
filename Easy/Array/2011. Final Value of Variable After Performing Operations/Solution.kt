class Solution {
    fun finalValueAfterOperations(operations: Array<String>): Int {

        var res = 0

        for(op in operations){
            if(op[1] == '+') res++ else res--
        }

        return res
    }
}
