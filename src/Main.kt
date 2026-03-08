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

class Scientist(val name: String) {
    override fun toString(): String {
        return "Scientist('$name')"
    }
}

class Counter(var start: Int) {
    fun increment() {
        start += 1
    }
    override fun toString() = start.toString()
}

class CounterHolder(counter: Counter) {
    private val ctr = counter
    override fun toString() =
        "CounterHolder: " + ctr
}

// 1) val vs var + data class
data class User(val name: String, val age: Int)

fun demoValVarDataClass() {
    val u1 = User("Ada", 42)
    val u2 = u1.copy(age = 43)     // creates a new object; u1 stays unchanged

    var counter = 0
    counter += 1                   // mutable variable

    println("u1=$u1")
    println("u2=$u2")
    println("counter=$counter")
}

// 2) Null-safety: ?, ?., ?:, !!
fun printLength(s: String?) {
    val len1: Int? = s?.length          // safe-call: null -> null
    val len2: Int = s?.length ?: 0      // Elvis operator: null -> fallback (0)

    // !! means "I know it's not null" (throws NPE if it actually is null)
    val len3 = s!!.length

    println("s=$s")
    println("len1=$len1")
    println("len2=$len2")
}

fun demoNullSafety() {
    printLength("hello")

    try {
        printLength(null) // will throw because of !!
    } catch (e: NullPointerException) {
        println("Caught NPE from '!!': ${e.message ?: "<no message>"}")
    }
}

// 3) let: common for nullable handling + scoping
fun greet(name: String?) {
    name?.let {
        println("Hello, $it!")          // executes only when name != null
    } ?: println("No name provided")    // runs when name == null
}

// Variant with an explicit parameter name (often more readable)
fun greet2(name: String?) {
    name?.let { n ->
        println("Uppercased: ${n.uppercase()}")
    } ?: println("No name provided")
}

fun demoLet() {
    greet("Ada")
    greet(null)
    greet2("Bob")
    greet2(null)
}

// 4) run / apply / also: scope functions with different return values
fun demoScopeFunctions() {
    // apply: configures an object; uses `this`; returns the object
    val sb = StringBuilder().apply {
        append("Hello")
        append(", ")
        append("world")
    }
    println("sb='$sb'")

    // also: "do something additionally"; uses `it`; returns the object
    val list = mutableListOf(1, 2, 3).also {
        println("Created list of size=${it.size}")
    }
    println("list=$list")

    // run: executes a block; returns the block result
    val result = run {
        val a = 2
        val b = 3
        a * b
    }
    println("result=$result")
}

// 5) Collections: map / filter / associateBy

data class Person(val id: Int, val name: String)

fun demoCollections() {
    val nums = listOf(1, 2, 3, 4, 5)
    val squares = nums.map { it * it }          // transforms each element
    val evens = nums.filter { it % 2 == 0 }     // keeps matching elements
    val squares2 = nums.map { n -> n * n }      // named lambda arg

    println("nums=$nums")
    println("squares=$squares")
    println("evens=$evens")
    println("squares2=$squares2")

    val people = listOf(Person(1, "Ada"), Person(2, "Bob"))
    val byId: Map<Int, Person> = people.associateBy { it.id } // id -> person

    println("people=$people")
    println("byId=$byId")
    println("byId[1]=${byId[1]}")
}

// 6) when as an expression (returns a value)

fun classify(x: Any): String =
    when (x) {
        is Int -> "int: $x"                         // smart cast to Int
        is String -> "string(len=${x.length})"      // smart cast to String
        else -> "other"
    }

fun demoWhenExpression() {
    println(classify(123))
    println(classify("hello"))
    println(classify(3.14))
}

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
    // String template: `$answer` is replaced with the value of the variable `answer` (here: 42).
    println("Found $answer!")
    // `$` starts interpolation only if followed by an identifier or `{...}`; since `1` is a digit,
    // this `$` is treated as a literal dollar sign, so it prints "$1".
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

    val zeep = Scientist("Zeep Xanflorp")
    println(zeep)

    val c = Counter(11)
    val ch = CounterHolder(c)
    println(ch)
    c.increment()
    println(ch)
    val ch2 = CounterHolder(Counter(9))
    println(ch2)

    demoValVarDataClass()
    demoNullSafety()
    demoLet()
    demoScopeFunctions()
    demoCollections()
    demoWhenExpression()
}