fun main() {
    val (N,M) = readln().split(' ').map { it.toInt() }
    val cards = readln().split(' ').map { it.toInt() }.toMutableList()
    cards.sort()

    var result = 0
    var sum =0

    for (i in 0 until N-2) {
        sum+=cards[i]
        for (j in i+1 until N-1) {
            sum+=cards[j]
            for (k in j+1 until N) {
                sum+=cards[k]
                if (sum<M) {
                    if (sum>result) result = sum // 같지 않은 값이 나올 경우 갱신이 필요
                    sum-=cards[k]
                    continue
                }
                else if (sum>M) {
                    sum-=cards[k]
                    break
                } else {
                    print(M)
                    return
                }
            }
            sum-=cards[j]
        }
        sum-=cards[i]
    }
    println(result)
}

/**
 * 또 다른 풀이
 */
/*
    fun main() {
    val (n,m) = readln().split(" ").map { it.toInt() }
    val array = readln().split(" ").map { it.toInt() }

    var answer = 0

    for (i in 0 until n-2){
        for (j in i+1 until n-1){
            for (k in j+1 until n){
                val sum = array[i]+array[j]+array[k]
                if (sum in (answer+1)..m) answer = sum
            }
        }
    }
    print(answer)
}
 */