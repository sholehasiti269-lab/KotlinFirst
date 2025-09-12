fun main(args: Array<String>){
    //Doubler program porsing
    println("Enter a Number and I'll double it: ")
    val input = readLine()!!
    var a = input.toInt() //eventually double
    a = a * 2
    println(a)

    println("Enter a number, and I'll square it: ")
    val number = readLine()!!.toInt()
    val square =number * number
    println("Result: " + square)

}