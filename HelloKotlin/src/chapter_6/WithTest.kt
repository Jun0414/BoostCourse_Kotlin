package chapter_6

fun main(args: Array<String>) {
    data class User(var name: String, var skills: String, var email: String? = null)
    var user = User("Kildong", "default")

    val result = with(user) {
        skills = "Kotlin"
        email = "kilding@example.com"
    }
    println(user)
    println("result: $result")
}