fun main() {
    readln().toInt()
    val numbers = readln().split(' ').map { it.toInt() }
    val target = readln().toInt()
    // count method로 원소의 갯수 찾을 수도 있음
    // val result = numbers.count { it == target}
    var result = 0
    numbers.forEachIndexed { idx,value->
        if (value==target) {
            result++
        }
    }
    println(result)
}