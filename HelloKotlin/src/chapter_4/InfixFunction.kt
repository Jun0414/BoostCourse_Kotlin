package chapter_4

fun main(args: Array<String>) {
    // 일반 표현법
    // val multi = 3.multiply(10)
    // val str = num.strPlus("Kotlin")

    // 중위 표현법
    val multi = 3 multiply 10
    println("multi: $multi")

    val num = 3
    val str = num strPlus "Kotlin"
    println(str)
}

// Int를 확장해서 multiply() 함수가 하나 더 추가되었음
infix fun Int.multiply(x: Int): Int {   // infix로 선언되므로 중위 함수
    return this * x
}

infix fun Int.strPlus(x: String): String {
    return "$x version $this"
}