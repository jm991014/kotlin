class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        val str1 = "$a$b"
        val str2 = "$b$a"
        if(str1.toInt() >= str2.toInt()){
            answer = str1.toInt()
        }else {
            answer = str2.toInt()
        }
        return answer
    }
}

// import kotlin.math.*
// return max("$a$b".toInt(), "$b$a".toInt())

fun main() {
    print(Solution().solution(9, 91))
}