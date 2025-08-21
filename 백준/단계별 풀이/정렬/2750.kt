fun main() {
    val N = readln().toInt()
    val arr = mutableListOf<Int>()

    repeat(N) {
        val num = readln().toInt()
        arr.add(num)
    }

    arr.sort()
    for (i in 0 until arr.size) {
        println(arr[i])
    }
}

/**
 * 또 다른 풀이
 */
/*
    fun main() {
    List(readln().toInt()) {
        readln().toInt()
    }.sorted()
        .forEach { println(it) }
}
 */
