package chapter_6

fun main(args: Array<String>) {
    // apply와 run 비교
    data class Person(var name: String, var skills: String)
    var person = Person("Kildong", "Kotlin")

    val returnObj = person.apply {
        name = "Sean"
        skills = "Java"
        "success" // 사용되지 않음
    }
    println(person)
    println("returnObj: $returnObj")

    val returnObj2 = person.run {
        this.name = "Dooly"
        this.skills = "C#"
        "success" // 반환값을 사용함
    }
    println(person)
    println("returnObj2: $returnObj2")
}