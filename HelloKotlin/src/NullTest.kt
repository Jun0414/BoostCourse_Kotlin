
// str1?.length를 해석해보면 str1이 null이면 length를 실행하지 않는다.
// str1!!.length를 해석해보면 str1이 null일리 없으니 그대로 실행해라. 하지만 null이었다면 NPE를 발생시킨다.
fun main(args: Array<String>) {
    var str1: String?
    str1 = "Hello"
    // 같은 코드 엘비스 연산자 표현법
    // val len  = str1?.length ?: -1
    val len = if (str1 != null) str1.length else -1

    println("str1: $str1, length: $len")
}