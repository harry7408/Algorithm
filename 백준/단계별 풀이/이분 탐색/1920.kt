fun main() {
    val n = readln().toInt()
    val numbers: List<Long> = readln().split(' ').map { it.toLong() }.sorted()
    val m = readln().toInt()
    val targets: List<Long> = readln().split(' ').map { it.toLong() }

    targets.forEachIndexed { idx, value ->
        if (numbers.binarySearch(value, 0, numbers.size) >= 0) {
            println(1)
        } else println(0)
    }
}

// 다른 풀이

/*
fun f()=readln().split(' ').map{it.toInt()}
fun main(){readln()
    val s=f().toSet()
    readln()
    f().map{println(if(it in s)1 else 0)}}
*/




