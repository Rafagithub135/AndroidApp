fun main() {
    println("Welcome to the Temperature Converter.  Please enter your name:  ")
    val name = readln()
    println("Welcome to the Temperature Converter Program $name.")
    println("Please type 1 to convert Celsius to Fahrenheit, 2 to convert Fahrenheit to Celsius, or 3 to exit:  ")
    val choice = readln().toInt()
    while (choice > 0) {
        if (choice == 1) {
            println("Please enter the temperature in Celsius:  ")
            val celsius = readln().toDouble()
            val fahrenheit = (celsius * 9 / 5) + 32
            println("$celsius degrees Celsius is $fahrenheit degrees Fahrenheit.")
        } else if (choice == 2) {
            println("Please enter the temperature in Fahrenheit:  ")
            val fahrenheit = readln().toDouble()
            val celsius = (fahrenheit - 32) * 5 / 9
            println("$fahrenheit degrees Fahrenheit is $celsius degrees Celsius.")
        } else if (choice == 3) {
            println("Thank you for using the Temperature Converter Program.  Goodbye $name!")
        } else {
            println("You have entered an invalid choice.  Please try again.")
        }
    }
}