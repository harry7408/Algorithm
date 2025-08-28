fun main() {
    val (N, M) = readln().split(' ').map { it.toInt() }

    val used = BooleanArray(N + 1)
    val answer = IntArray(M)
    val sb = StringBuilder()

    fun dfs(depth: Int) {
        if (depth == M) {
            for (i in 0 until M) {
                sb.append(answer[i]).append(' ')
            }
            sb.append('\n')
            return
        }

        for (i in 1..N) {
            if (!used[i]) {
                used[i] = true
                answer[depth] = i
                dfs(depth + 1)
                used[i] = false
            }
        }
    }
    dfs(0)
    print(sb)
}






