package chapter_5

// readLine()은 코틀린 io의 표준함수로 콘솔로부터 한줄 입력을 받아들인다.
fun main(args: Array<String>) {
    println("Enter the score: ")
    val score = readLine()!!.toDouble()
    var grade: Char = 'F'

    when {
        score >= 90.0 -> grade = 'A'
        score in 80.0..89.9 -> grade = 'B'
        score in 70.0..79.9 -> grade = 'C'
        score < 70.0 -> grade = 'F'
    }

    println("score: $score, grade: $grade")
}