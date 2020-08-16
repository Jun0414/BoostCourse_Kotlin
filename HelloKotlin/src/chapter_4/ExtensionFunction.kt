package chapter_4

fun main(args: Array<String>) {
    val source = "Hello World!"
    val target = "Kotlin"
    println(source.getLongString(target))
}

//String을 확장해 getLongString 추가
fun String.getLongString(target: String): String =
        if (this.length > target.length) this else target