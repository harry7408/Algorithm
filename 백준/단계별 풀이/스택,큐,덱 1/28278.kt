import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()

    val stack = Stack<Int>()
    val out = StringBuilder()

    repeat(n) {
        val line = br.readLine()
        when (line[0]) {
            '1' -> {
                val x = line.substring(2).toInt()
                stack.push(x)
            }
            '2' -> {
                if (stack.isEmpty()) out.append("-1\n")
                else out.append("${stack.pop()}\n") // pop 한 번으로 값+제거
            }
            '3' -> out.append("${stack.size}\n")
            '4' -> out.append(if (stack.isEmpty()) "1\n" else "0\n")
            '5' -> out.append(if (stack.isEmpty()) "-1\n" else "${stack.peek()}\n")
        }
    }
    print(out.toString())
}



