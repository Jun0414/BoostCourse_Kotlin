package chapter_4

fun main(args: Array<String>) {
    val number = 5
    println("Factorial: $number -> ${factorial(number)}")
}

// tailrec을 써주면 꼬리재귀를 사용 가능하다.
tailrec fun factorial(n: Int, run: Int = 1): Long {
    return if (n == 1) run.toLong() else factorial(n - 1, run * n)
}