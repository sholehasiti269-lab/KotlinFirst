fun main(args: Array<String>){
    val valInt: Int = 1
    val valSum: Long = 3L + valInt // konversi implisit
    println("Konversi variabe valInt secara implisit : " + valSum)
    val valLong: Long = valInt.toLong() // Konversi eksplisit
    println("Konversi varibel valInt secara elsplisit : " + valLong)
}