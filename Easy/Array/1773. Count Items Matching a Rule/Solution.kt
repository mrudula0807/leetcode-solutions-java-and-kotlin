class Solution {
    fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {

        val index = when(ruleKey){
            "type" -> 0
            "color" -> 1
            "name" -> 2
            else -> error("Invalid")
        }

        return items.count {
            it[index] == ruleValue
        }
    }
}
