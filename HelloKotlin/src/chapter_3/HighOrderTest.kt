package chapter_3

fun highFunc(sum: (Int, Int) -> Int, a: Int, b: Int): Int {
    return sum(a, b)
}

// 람다식(익명)을 사용하면 간략하게 함수를 표현할 수 있다.
fun main(args: Array<String>) {
    val result = highFunc({x, y -> x + y}, 1, 3)
    println(result)

    // 위와 동일하나 람다식을 뒤로 옮길 경우 ()밖으로 빼서 길어지면 행을 나눠 쓸 수 있다.(fun문의 인자도 가장 마지막 인자로 이동시켜준다.)
    // val result = highFunc(1, 3) {x, y ->
    // x + y
    // }
    // println(result)
}

