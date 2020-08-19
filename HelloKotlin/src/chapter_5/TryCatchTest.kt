package chapter_5

fun main(args: Array<String>) {
    val a = 6
    val b = 0
    val c: Int

    try {
        c = a / b
        println("after")
    } catch (e: Exception) {
        println("Exception")
        e.printStackTrace() // 예외처리가 일어난 부분 알려준다.
    } finally {
        println("Finally")
    }
}