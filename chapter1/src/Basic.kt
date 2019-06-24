fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sumTwo(a: Int, b: Int) = a + b


fun sumThree(a: Int, b: Int): Unit {
    println("$a:$b")
}

fun sumF(a: Int, b: Int) {
    println("$a:$b")
}

val a: Int = 1
val b = 2
val c: Int = 3

var x = 18

var s1 = "a is $a"
val s2 = "${s1.replace("is", "was")}"

fun getInt(): Int? {
    return null
}

fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}


fun maxOfIf(a: Int, b: Int) = if (a > b) a else b

fun main() {
    x += 2
    println(s2)
    println(maxOf(2, 5))
    println(getInt())
}