package chapter_5

fun main(args: Array<String>) {
    var amount = 6000

    try {
        amount -= 1000
        checkAmount(amount)
    } catch (e: Exception) {
      println(e.printStackTrace())
    }
    println("amount: $amount")
}

fun checkAmount(amount: Int) {
    if (amount < 10000) {
        throw Exception("잔고가 $amount 으로 10000 이하입니다.")
    }
}