fun main() {
    val (n, m, r) = readln().split(' ').map { it.toInt() }
    // 인접 리스트 방식 필요
    val board = Array(n + 1) { mutableListOf<Int>() }
    val visited = BooleanArray(n + 1)
    val order = IntArray(n + 1)
    var count = 1

    repeat(m) {
        val (start, end) = readln().split(' ').map { it.toInt() }
        board[start].add(end)
        board[end].add(start)
    }

    for (i in 1..n) {
        board[i].sort()
    }

    val stack = ArrayDeque<Int>()
    stack.addLast(r)
    while (stack.isNotEmpty()) {
        val current = stack.removeLast()
        if (visited[current]) continue
        visited[current]=true
        order[current]=count++

        // 역순으로 stack에 push해야 pop할 때 오름 차순을 맞출 수 있다
        val adj = board[current]
        for (i in adj.size-1 downTo 0) {
            val next= adj[i]
            if (!visited[next]) stack.addLast(next)
            order.drop(1)
        }
    }

    val sb = StringBuilder()
    for (i in 1..n) {
        sb.append(order[i]).append('\n')
    }
    print(sb)
}

// 다른 풀이
/*
fun main() = with(System.`in`.bufferedReader()) {
    val (n, m, r) = readLine().split(" ").map { it.toInt() }

    val tree = Array(n + 1) { mutableListOf<Int>() }
    repeat(m) {
        val (a, b) = readLine().split(" ").map { it.toInt() }
        tree[a].add(b)
        tree[b].add(a)
    }
    tree.forEach { it.sort() }

    val visited = IntArray(n + 1) { 0 }
    var order = 1

    fun dfs(current: Int) {
        visited[current] = order++
        for (next in tree[current]) {
            if (visited[next] == 0) {
                dfs(next)
            }
        }
    }

    dfs(r)

    println(visited.drop(1).joinToString("\n"))
}
/*

