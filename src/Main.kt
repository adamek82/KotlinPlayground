//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun multiplyByTwo(x: Int): Int {
    println("Inside multiplyByTwo")
    return x * 2
}

fun multiplyByThree(x: Int): Int = x * 3

fun multiplyByFour(x: Int) = x * 4

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
}