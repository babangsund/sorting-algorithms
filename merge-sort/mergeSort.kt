fun <T:Comparable<T>> merge(a: List<T>, b: List<T>): List<T> {
    if (a.isEmpty() && b.isNotEmpty()) return b
    if (b.isEmpty() && a.isNotEmpty()) return a

    val (ah, at) = Pair(a[0], a.drop(1))
    val (bh, bt) = Pair(b[0], b.drop(1))

    return when {
        ah >= bh -> listOf(bh) + merge(a, bt)
        else -> listOf(ah) + merge(at, b)
    }
}

fun <T:Comparable<T>> mergeSort(list: List<T>): List<T> {
    val len = list.count()
    if (len < 2) return list

    val half = kotlin.math.ceil((len.toDouble() / 2)).toInt()
    val (left, right) = list.chunked(half)

    return merge(mergeSort(left), mergeSort(right))
}

fun main() {
    val sorted = mergeSort(listOf(6, 5, 2, 3, 0, 1))
    println("sorted: $sorted")
}
