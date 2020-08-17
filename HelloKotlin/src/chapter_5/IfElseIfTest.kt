package chapter_5

// readLine()은 코틀린 io의 표준함수로 콘솔로부터 한줄 입력을 받아들인다.
fun main(args: Array<String>) {
    println("Enter the score: ")
    val score = readLine()!!.toDouble()
    var grade: Char = 'F'

    if (score >= 90.0) {
        grade = 'A'
    }
    // 범위 연산자(range)
    // else if (score >= 80.0 && score <= 89.9)
    else if (score in 80.0..89.9) {
        grade = 'B'
    } else if (score in 70.0..79.9) {
        grade = 'C'
    }

    println("score: $score, grade: $grade")
}