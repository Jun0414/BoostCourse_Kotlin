package chapter_4

// show kotlin bytcode로 확인해보면 main에 이함수가 복사되어있는것을 볼 수 있다.
// (즉, 점프뛰는것을 방지해 오버헤드를 줄일 수 있음)
// 그렇지만 너무 남용하면 코드의 길이가 길어져 안좋음(보이지는 않지만 추가된 것.)
inline fun shortFunc(a: Int, out: (Int) -> Unit) {
    println("Hello")
    out(a)
}

fun main(args: Array<String>) {
//    shortFunc(3, {a -> println("a: $a")})
    shortFunc(3, {println("a: $it")})
}