fun main() {
    val piece = readln().trim().split(' ').map { it.toInt() }
    val total = listOf(1,1,2,2,2,8)
    val result = mutableListOf(0,0,0,0,0,0)

    for (i in 0 until 6) {
        result[i] = total[i]-piece[i]
    }

    for(i in 0 until 6) {
        print("${result[i]} ")
    }
}