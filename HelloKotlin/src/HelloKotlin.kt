// ctrl + b 를 누르면 그 함수의 하위 라이브러리를 계속해서 타고 들어갈 수 있다.

// 함수명, 일반 변수명은 camelCase로(carEngine) 작성하고
// 클래스, 인터페이스는 CarEngine 과 같이 의미있는 단어의 첫 글자를 대문자로 표기한다.

// edit configuration에서 program arguments에 데이터를 띄어쓰기 단위로 넣으면 기본 arg를 세팅할 수 있다.
fun main(args: Array<String>) {
    println("args[0] = ${args[0]}")
    println(args[1])
    println(args[2])
    println(args[3])

    datatype()
}

// val은 선언이후 변경 불가, var은 선언이후 변경 가능
// 가져다 쓸 변수가 하나라면 $만 쓰고 변수명을 써줘도 된다.
// ctrl + shift + p 를 누르면 해당 변수가 어떤 타입인지 알려준다.(타입 지정을 안했을 때)
// 숫자의 경우 가독성을 위해 언더바로 자리수를 나눠놓을 수 있다.(코드상에는 아무런 영향없음)
fun datatype() {
    var username: String = "WonJun"
    var count: Int = 3_000
    username = "Dooly"

    println("username: ${username}, conut: $count")
}