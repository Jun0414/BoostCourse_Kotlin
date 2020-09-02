package chapter_6

fun main(args: Array<String>) {
    val score: Int? = 32
//    val score = null

//    일반적인 null 검사
    fun checkScore() {
        if (score != null) {
            println("score: $score")
        }
    }

    // let을 사용해 null 검사를 제거
    // let은 null이 아닌 경우에만 실행한다.
    // else와 같은 효과를 주려면
    // score?.let { println("Score: $it") } ?: println("Score is null")
    fun checkScoreLet() {
        score?.let { println("Score: $it") }
        val str = score.let { it.toString() }
        println(str)
    }

    checkScore()
    checkScoreLet()
}
