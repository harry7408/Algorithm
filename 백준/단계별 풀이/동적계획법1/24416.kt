fun main() {
    val n = readln().toInt()

    var recursiveCount = 0
    var dpCount = 0

    val dpArray = mutableListOf<Int>()
    dpArray.add(0)
    dpArray.add(1)
    dpArray.add(1)

    fun recursiveCall(value: Int): Int {
        when (value) {
            0 -> {
                return 0
            }

            in 1..2 -> {
                recursiveCount++
                return 1
            }

            else -> {
                return recursiveCall(value - 1) + recursiveCall(value - 2)
            }
        }
    }

    fun fibonacci(value: Int): Int {
        when (value) {
            0 -> {
                return dpArray[0]
            }

            in 1..2 -> {
                return dpArray[value]
            }

            else -> {
                for (i in 3..value) {
                    dpCount++
                    dpArray.add(dpArray[i - 2] + dpArray[i - 1])
                }
                return dpArray[n - 1]
            }
        }
    }

    recursiveCall(n)
    fibonacci(n)

    println("$recursiveCount $dpCount")
}






