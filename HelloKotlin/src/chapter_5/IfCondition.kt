package chapter_5

fun main(args: Array<String>) {
    val a = 12
    val b = 5

    // 블록과 함께 사용(return을 사용하지 않는다.)
    val max = if (a > b) {
        println("a 선택")
        a // 마지막 식인 a가 반환되어 max에 할당
    }
    else {
        println("b 선택")
        b // 마지막 식인 b가 반환되 max에 할달
    }

    println(max)
}