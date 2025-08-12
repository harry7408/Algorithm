fun main() {
    val (N,M)= readln().split(' ').map { it.toInt() }

    val A = Array(N) { IntArray(M) }
    val B = Array(N) { IntArray(M) }

    repeat(N) { i->
        val row = readln().split(' ').map { it.toInt() }
        for (j in 0 until M) A[i][j]=row[j]

    }

    repeat(N) { i->
        val row = readln().split(' ').map { it.toInt() }
        for (j in 0 until M) B[i][j]=row[j]
    }

    val sb = StringBuilder()
    repeat(N) { i ->
        val summed = IntArray(M) { j -> A[i][j] + B[i][j] }
        sb.append(summed.joinToString(" "))
        if (i != N - 1) sb.append('\n')
    }
    print(sb.toString())

}