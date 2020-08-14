package chapter_4

fun main(args: Array<String>) {
    val result = callByName(otherLambda)    // 람다식 이름으로 호출
    println(result)
}

fun callByName(b: () -> Boolean): Boolean { // 람다식 함수 자료형으로 선언된
    println("callByName function")
    return b()  // 여기서 otherLambda가 호출 된다.
}

val otherLambda: () -> Boolean = {  // 람다식 이름으로 호출되어 먼저 실행되지 않고 통째로 callByName의 인자 b에 들어간다.
    println("otherLambda function")
    true
}


// 다른 함수의 참조에 의한 호출
fun summ(x: Int, y: Int) = x + y

fun funcParam(a: Int, b: Int, c: (Int, Int) -> Int): Int {
    return c(a, b)
}

//funcParam(3,2, summ) // main에서 호출한다고 생각했을때 오류발생
//funcParam(3,2, ::summ) // main에서 호출한다고 생각했을때 가능 (참조에 의한 호출: 비슷한 모양을 가진 것으로 판단되면 인자로 받을 수 있다)