class Solution {
    fun findContentChildren(g: IntArray, s: IntArray): Int {

        g.sort()
        s.sort()
        
        var child = 0
        var cookie = 0

        while(child < g.size && cookie < s.size){

            if(g[child] <= s[cookie]){
                child++
            }

            cookie++ 
        }

        return child
    }
}
