fun main() {
    val br = System.`in`.bufferedReader()
    var (n, k) = br.readLine().split(" ").map { it.toInt() }

    val coins = mutableListOf<Int>()
    var result = 0


    repeat(n) {
        coins.add(br.readLine().toInt())
    }

    coins.sortByDescending { i ->
        i
    }

    while (k > 0) {
        coins.forEachIndexed { idx, value ->
            if (k / value > 0) {
                result += (k / value)
                k = k % value
            }
        }
    }
    println(result)
}

// 다른 풀이

/*fun main() {
    var (n, k) = readln().split(" ").map { it.toInt() }
    val list = List(n) { readln().toInt() }
    println(list.foldRight(0) { i, acc -> if (k >= i) (acc + k / i).also { k %= i } else acc })
}*/



