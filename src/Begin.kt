val k = 4
val o = 3
val t = 9.0

var l = 10
var i = 11
var n: Int = 3
var count: Int = 0

fun mult(a: Int, b: Int): Int {
    var total = 0
    count += 1
    total += a * b
    if (total < 10000) {
        total = total * o
        println("The total is $total")
        mult(total, k)
    }
    return total
}

fun hi(name: String) = "Hi $name!"


fun main(args: Array<String>) {
    println(mult(l, i))
    println("The count is $count")
    println(hi("Ralph"))
    println(mult (n, k))
    println("The new count is $count")
}