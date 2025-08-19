import kotlin.math.pow

fun main() {
    val (N,B) = readln().split(' ')

    val arr = N.map { ch ->
        if (ch.isDigit()) {
            ch.digitToInt()
        } else {
            (ch-'A' + 10)
        }
    }
    var result = 0.0

    arr.forEachIndexed { index, i ->
        result += B.toDouble().pow(n = arr.size-index-1) * i
    }
    println(result.toInt())
}

/**
 * 또 다른 풀이
 */
/*
fun main() {
	val (N, B) = readln().split(" ")
    print(N.toInt(B.toInt()))
}
*/