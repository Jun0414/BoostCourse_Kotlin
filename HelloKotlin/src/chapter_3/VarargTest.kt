package chapter_3

// vararg는 같은 타입의 여러 변수를 받을 수 있게 간단하게 작성하는 방법이다.
fun normalVarargs(vararg a: Int) {
    for (num in a) {
        print("$num ")
    }
}

fun main(args: Array<String>) {
    normalVarargs(1)
    println()
    normalVarargs(1,2,3,4)
}