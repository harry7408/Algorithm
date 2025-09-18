import java.util.*

fun main() {
    val n = readln().toInt()
    val heap = PriorityQueue<Int>(compareByDescending { it })

    repeat(n) {
        val x = readln().toInt()
        when (x) {
            0 -> {
                if (heap.isEmpty()) println(0) else {
                    println(heap.poll())
                }
            }

            else -> {
                heap.add(x)
            }
        }
    }
}

// 다른 풀이
/*
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val N = br.readLine().toInt()
    val heap = IntArray(100001)
    var size = 0
    val ans = StringBuilder()

    fun swap(a: Int, b: Int) {
        val tmp = heap[a]
        heap[a] = heap[b]
        heap[b] = tmp
    }

    fun add(a: Int) {
        // 우선 말단에 추가
        heap[++size] = a
        var i = size
        // 부모 자식 노드 간 비교를 하며 위치 조정
        while (i > 1) {
            if (heap[i / 2] < heap[i]) swap(i / 2, i) else break
            i /= 2
        }
    }

    fun maxOut() {
        // 첫 번째 원소가 최댓 값
        ans.append(heap[1]).append('\n')
        // 마지막 원소를 root로 올리고 그 위치는 0으로 채우기
        heap[1] = heap[size]
        heap[size--] = 0
        var me = 1
        while (me * 2 <= size) {
            val lchild = me * 2
            val rchild = me * 2 + 1
            if (heap[me] > heap[lchild] && heap[me] > heap[rchild]) break
            else if (heap[lchild] > heap[rchild]) {
                swap(me, lchild)
                me = lchild
            } else {
                swap(me, rchild)
                me = rchild
            }
        }
    }

    repeat(N) {
        val tmp = br.readLine().toInt()
        if (tmp == 0) { // 최댓값 출력
            if (size == 0) ans.append(0).append('\n') else maxOut()
        } else { // 해당 값 배열에 넣기
            add(tmp)
        }
    }

    bw.write(ans.toString())
    br.close()
    bw.flush()
    bw.close()
}
*/



