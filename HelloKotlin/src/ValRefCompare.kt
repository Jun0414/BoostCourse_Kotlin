
// Int는 기본형(int)이 아니라 참조형이라서 값은 같더라도 참조는 각각 다르게 새로 만들기때문에 다르다.
// 코틀린에서는 참조형으로 선언한 변수의 값이 -128~127 범위에 있으면 캐시에 그 값을 저장함.(그래서 같은 값으로 인식할 수 있음.)
fun main(args: Array<String>) {
    val a: Int = 128
    val b = a

    val c: Int? = a
    val d: Int? = a
    val e: Int? = c

    println(c == d)
    println(c === d)
    println(c === e)
}