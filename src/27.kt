fun main(args: Array<String>){
    //simple calculator
    println("welcome to calculator")
    println("Enter the first number:")
    val a = readLine()!!.toDouble()
    println("Enter the second number:")
    val b = readLine()!!.toDouble()
    val sum = a + b
    val difference = a - b
    val product = a * b
    val quotient = a / b
    println("Sum: ${difference}")
    println("Difference: $difference")
    println("Product: ${product}")
    println("Quotient: ${quotient}")
    println("Thank you for using calculator")
}