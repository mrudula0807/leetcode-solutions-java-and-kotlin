class Solution {
    fun destCity(paths: List<List<String>>): String {
        
        val set = HashSet<String>()

        for(path in paths){
            set.add(path[0])
        }

        for(path in paths){
            if(path[1] !in set){
                return path[1]
            }
        }

        return ""
    }
}
