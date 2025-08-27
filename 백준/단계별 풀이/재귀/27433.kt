fun fibo(n: Int): Long {
    return when (n) {
        0 -> return 1L
        in 1..20 -> return n * fibo(n - 1)
        else -> {
            0L
        }
    }
}

fun main() {
    val br = System.`in`.bufferedReader()
    val N = br.readLine().toInt()

    println(fibo(N))
}

/**
 * 다른 풀이
 */
/*fun main() {
    var result = 1L
    for (i in 1..readln().toInt()) result *= i
    println(result)
}*/
