package Module1

val k = 4
val o = 3
val t = 9.0

var l = 10
var i = 11
var n: Int = 3
var count: Int = 0

var total = 0
fun mult(a: Int, b: Int): Int {
    count += 1
    total += a * b
    println(total)
    if (total < 10000) {
        total *= o
        println("The Module1.total is $total")
        mult(total, k)
    } else {
        println("The final Module1.total is $total")
    }
    return total
}

fun hi(name: String) = "Hi $name!"

fun mary() {
    val name = "Mary"
    val age = 20
    println("$name is $age years old.")
}


fun main(args: Array<String>) {
    println(mult(l, i))
    println("The Module1.count is $count")
    println(hi("Ralph"))
    println(mult (n, k))
    println("The new Module1.count is $count")
    println(mary())
}