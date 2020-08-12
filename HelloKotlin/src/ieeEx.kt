
// 지수부와 가수부의 제한이 있기때문에 100이 나오지 않고 뒤에 값이 더 나오는 것임.
fun main(args: Array<String>) {
    var num: Double = 0.1

    for (x in 0..999) {
        num += 0.1
    }
    println("num: $num")
}