// 입력받은 문자열을 k번만큼 반복
class Solution {
    fun solution(my_string: String, k: Int): String {
        var answer: String = ""
        for(i in 1..k) {
            answer += my_string
        }
        return answer
    }
}

//  return my_string.repeat(k)


// fun main() {
//     var ans = Solution().solution("aaa", 3)
//     print(ans)
// }