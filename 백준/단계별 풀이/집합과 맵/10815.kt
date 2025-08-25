fun main() {
    readln().toInt()
    val cards = readln().split(' ').map { it.toInt() }.toMutableList()
    cards.sort()

    readln().toInt()
    val checkList = readln().split(' ').map { it.toInt() }
    val result = mutableListOf<Int>()

    checkList.forEachIndexed { idx, value ->
        if (cards.binarySearch(value) >= 0) result.add(1) else result.add(0)
    }
        println(result.joinToString(" "))
}

/**
 * 다른 풀이
 */

/*fun main() {
    readln()
    val ns = readln().split(' ').toSet()
    readln()
    val sb = StringBuilder()
    readln().split(' ').forEach {
        sb.append(if (ns.contains(it)) 1 else 0).append(' ')
    }
    println(sb)
}
------------------------------
fun r()=readln()
fun t()=r().split(" ").map{it.toInt()}
fun main(){
    r()
    val n=t().toSet()
    r()
    println(t().joinToString(" ")
    {if(n.contains(it))"1" else "0"})
}*/



