package chapter_5

fun main(args: Array<String>) {
    var total = 0

    for (num in 1..100 step 2) {    // 홀수합
        total += num
    }

    println("total: $total")
}