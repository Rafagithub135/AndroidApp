val k = 4
val o = 3
val t = 9.0

var l = 10
var i = 11
var n: Int = 3
var count: Int = 0

fun mult(a: Int, b: Int): Int {
    count += 1
    return a * b
}

fun hi(name: String) = "Hi $name!"

fun main(args: Array<String>) {
    println(mult(l, i))
    println("The count is $count")
    println(hi("Ralph"))
    println(mult (n, k))
    println("The new count is $count")
}