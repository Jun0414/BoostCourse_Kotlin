package chapter_5

fun main(args: Array<String>) {
    do {
        println("Enter the number: ")
        var input = readLine()!!.toInt()

        // for (i in 0 until input) // until은 input - 1 까지 카운트해준다.
        for (i in 0..(input - 1)) {
            for (j in 0..(input - 1)) {
                print((i + j) % input + 1)
            }
            println()
        }
    }   while (input != 0)
}