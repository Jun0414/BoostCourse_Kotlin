package chapter_3

// 반환값 타입을 지정하지 않으면 return문을 쓸 수 없다.
// default값을 미리 써놓으면 호출할때 없는경우 default값을 사용한다.
// 같은 코드
// fun sum(a: Int, b: Int = 5): Int = a + b
fun sum(a: Int, b: Int = 5): Int {
    return a + b
} // 최상위 함수(위치 상관없이 호출 가능하다.)

// 추론가능할 경우 반환값도 생략 가능.
// fun max(a: Int, b: Int) = return if (a > b) a else b
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

// 반환타입이 Unit또는 없는 경우 return Unit이 생략되어있는것.
// fun outfunc(name: String) = println("Name: $name")
fun outfunc(name: String): Unit {
    println("Name: $name")
}

fun main(args: Array<String>) { // 최상위(Top-level) 함수

    fun add(a: Int, b: Int): Int {
        return a + b
    } // 지역 함수(지역함수를 쓰려면 호출하는 문장보다 위에 써야한다.)

    val result1 = sum(a=2, b=3)

    val a = 3
    val b = 5

    val result2 = max(a, b)
    outfunc(name= "WonJun")

    println(result1)
    println(result2)
}