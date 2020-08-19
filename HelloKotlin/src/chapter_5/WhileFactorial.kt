package chapter_5

fun main(args: Array<String>) {
    println("Enter the number: ")
    var number = readLine()!!.toInt()
    var factorial: Long = 1

    while (number > 0) {
        factorial *= number
        --number
    }
    println("Factorial: $factorial")
}