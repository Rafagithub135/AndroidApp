//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Enter the price of the item:  ")
    val price = readLine()!!.toDouble()
    println("Enter the quantity of the item:  ")
    val quantity = readLine()!!.toInt()
    println("The total cost is:  " + (price * quantity))

}