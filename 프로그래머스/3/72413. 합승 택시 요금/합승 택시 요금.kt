class Solution {
    fun solution(n: Int, s: Int, a: Int, b: Int, fares: Array<IntArray>): Int {
        val dist = Array(n + 1) { IntArray(n + 1) { 10000000 } }
        
        for (i in 1..n) { dist[i][i] = 0 }

        for (fare in fares) {
            val (u, v, w) = fare
            dist[u][v] = w
            dist[v][u] = w
        }
        
        for (i in 1..n) {
            for (j in 1..n) {
                for (k in 1..n) {
                    dist[j][k] = dist[j][k].coerceAtMost(dist[j][i] + dist[i][k])
                }
            }
        }
        
        var answer = 10000000
        for (i in 1..n) {
            answer = answer.coerceAtMost(dist[s][i] + dist[i][a] + dist[i][b])
        }

        return answer
    }
}