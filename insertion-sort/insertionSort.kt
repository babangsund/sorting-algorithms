fun <T:Comparable<T>> insert(elem: T, list: List<T>): List<T> {
    return if (list.isEmpty()) listOf(elem)
    else {
        val head = list[0]
        val tail = list.drop(1)

        if (elem <= head) listOf(elem, head) + tail
        else listOf(head) + insert(elem, tail)
    }
}

fun <T:Comparable<T>> insertionSort(list: List<T>): List<T> {
    return if (list.isEmpty()) list
    else {
        val head = list[0]
        val tail = list.drop(1)
        insert(head, insertionSort((tail)))
    }
}

fun main() {
    val sorted = insertionSort(listOf(6,5,2,3,0,1))
    println("sorted: $sorted")
}