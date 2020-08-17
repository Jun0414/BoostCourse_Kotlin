package chapter_4

fun a() = b()   // 최상위 함수 이므로 b()함수 선언 위치에 상관없이 사용가능
fun b() = println("b")  // b()함수의 선언

fun c() {
//    fun d() = e()   // 오류! d()는 지역함수이며 e()의 이름을 모름
//    fun e() = println("e")
}

fun main(args: Array<String>) {
    a() // 최상위 함수는 어디서든 호출될 수 있다.
//    e() // 오류! c()함수에 정의된 e()는 c의 블록({})을 벗어난 곳에서 사용할 수 없음
}