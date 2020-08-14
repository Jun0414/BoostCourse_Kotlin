package chapter_4

// 람다식은 {} 안에 써준다.
fun main(args: Array<String>) {
    val result: Int

//    val multi = {a: Int, b: Int -> a * b}
//    val multi: (a: Int, b: Int) -> Int = {a, b -> a * b}
    val multi: (Int, Int) -> Int = {a, b ->
        println("a: $a, b: $b")
        a * b}

//    val greet: () -> Unit = { println("Hello World!")}
    val greet = { println("Hello World!")}
//    val nestedLambda: () -> () -> Unit = {{ println("nestedLambda")}}
    val nestedLambda = {{ println("nestedLambda")}}

    result = multi(10, 20)
    println(result)
    println(greet)
    println(nestedLambda)
}