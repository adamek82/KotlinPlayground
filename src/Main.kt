//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun multiplyByTwo(x: Int): Int {
    println("Inside multiplyByTwo")
    return x * 2
}

fun multiplyByThree(x: Int): Int = x * 3

fun multiplyByFour(x: Int) = x * 4

fun trueOrFalse(exp: Boolean): String {
    if (exp)
        return "It's true!"
    return "It's false"
}

fun oneOrTheOther(exp: Boolean): String =
    if (exp)
        "True!" // No 'return' necessary
    else
        "False"

fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }

    val r = multiplyByTwo(5)
    println(r)
    println(multiplyByThree(5))
    val result: Int = multiplyByFour(5)
    println(result)
    val result2 = multiplyByFour(5)
    println(result2)

    val x: Boolean = 1 >= 1
    if (x)
        println("It's true!")

    val n: Int = -11
    if (n > 0)
        println("It's positive")
    else if (n == 0)
        println("It's zero")
    else
        println("It's negative")

    val y: Boolean = false
    if (!y)
        println("!y is true")

    val num = 10
    val result_num = if (num > 100) 4 else 42
    println(result_num)

    val b = 1
    println(trueOrFalse(b < 3))
    println(trueOrFalse(b >= 3))

    val z = 1
    println(oneOrTheOther(z == 1))
    println(oneOrTheOther(z == 2))

    val answer = 42
    println("Found $answer!")
    println("printing a $1")

    val s = "hi\n" // \n is a newline character
    val m = 11
    val d = 3.14
    println("first: " + s + "second: " + m + ", third: " + d)

    val condition = true
    println("${if (condition) 'a' else 'b'}")
    val xx = 11
    println("$xx + 4 = ${xx + 4}")

    val str = "value"
    println("str = \"$str\".")
    println("""str = "$str".""")

    val million = 1_000_000 // Infers Int
    println(million)

    val numerator: Int = 19
    val denominator: Int = 10
    println(numerator % denominator)
    println(numerator / denominator)
}