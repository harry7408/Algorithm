fun main() {
    val (_, x) = readln().split(' ').map { it.toInt() }
    val arrays = readln().split(' ').map { it.toInt() }

   arrays.forEachIndexed { idx, value ->
      if (x>value) print("$value ")
   }
}

// 다른 풀이
/* fun main() {
    val (N, X) = readln().split(" ").map { it.toInt() }
    print(readln().split(" ").filter { it.toInt() < X }.joinToString(" "))
} */



