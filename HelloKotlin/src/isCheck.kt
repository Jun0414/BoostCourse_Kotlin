
// is 키워드
// Any 타입은 모든 타입이 다 가능한 것.
fun main(args: Array<String>) {
    val num = 256
    var a: Any = 1

    if (num is Int) {
        print(num)
    } else if (num !is Int) {
        print("Not a Int")
    }
}