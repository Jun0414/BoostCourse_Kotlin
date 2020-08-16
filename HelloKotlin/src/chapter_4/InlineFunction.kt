package chapter_4

// show kotlin bytcode로 확인해보면 main에 이함수가 복사되어있는것을 볼 수 있다.
// (즉, 점프뛰는것을 방지해 오버헤드를 줄일 수 있음)
// 그렇지만 너무 남용하면 코드의 길이가 길어져 안좋음(보이지는 않지만 추가된 것.)
// noinline은 해당 부분만 inline에서 빼낼 수가 있다.
// crossinline은 해당 func에서 실수로 return을 하는 것을 방지해준다.
inline fun shortFunc(a: Int, noinline out: (Int) -> Unit) { // crossinline을 noinline 대신에 사용해준다.
    println("Hello")
    out(a)
}

fun main(args: Array<String>) {
//    shortFunc(3, {a -> println("a: $a")})
    shortFunc(3) {
        println("a: $it")
        // return 여기서 noinline 이나 crossinline이라면 사용 불가 표시가 뜬다.
    }
}