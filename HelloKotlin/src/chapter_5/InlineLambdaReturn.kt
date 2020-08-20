package chapter_5

fun main(args: Array<String>) {

}

inline fun inlineLambda (a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a, b)
}

// 함수이름(지어도 됨)@ 하고 return@함수이름 하면 그함수문만을 탈출하게된다.
// 암묵적 라벨은 return@inlineLambda를 써도 그 함수문만 탈출하게된다.
fun retFunc() {
    println("Start of Func")
    inlineLambda(12, 3) lit@{ a, b ->
        val result = a + b
        if (result > 10) return@lit
        println("result: $result")
    }
    println("End of Func")
}