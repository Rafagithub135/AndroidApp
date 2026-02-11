fun main(args: Array<String>) {
    println("Enter your age:  ")
    val age = readln().toInt()
    if (age > 59) {
        println("Are you working?  Please answer yes or no.")
        val work = readln()
        if (work == "yes") {
            println("You are a Working senior.")
        } else {
            println("You are a Retired senior.")
        }
    } else if (age > 20) {
        println("You are an adult.")
    } else if (age > 12) {
        println("You are a teen.")
    } else {
        println("You are a Child.")
    }
}