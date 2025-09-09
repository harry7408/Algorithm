fun main() {
    val (n, m) = readln().split(' ').map { it.toInt() }
    val numberList = readln().split(' ').map { it.toInt() }
    val addList= mutableListOf<Int>()
    numberList.forEachIndexed { idx, value ->
        if (idx==0) {
            addList.add(value)
        }
        else {
            addList.add(value+addList[idx-1])
        }
    }

    repeat(m) {
        val (start, end) = readln().split(' ').map { it.toInt() }
        if (start == 1) {
            println(addList[end-1])
        } else {
            println(addList[end-1]-addList[start-1-1])
        }
    }
}

// 다른 풀이
/*fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val l = readln().split(" ").runningFold(0) { a, s -> a + s.toInt() }
    repeat(m) {
        val (i, j) = readln().split(" ").map { it.toInt() }
        println(l[j] - l[i - 1])
    }
}*/





