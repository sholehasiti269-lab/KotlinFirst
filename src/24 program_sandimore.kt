fun main(args: Array<String>){
    //split() and joinToString()
    //mose code decoder
    //the String which we want to decode
    val s = ".. -.-. - ... --- -.- .. .-n.-.."
    println("The original message: $s")

    //the string with the decoded message
    var message = ""

    //array definition
    val alphabetChars = "abcdefghijklmnopqrstuvwxyz"
    val morseChars = arrayOf(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..")

    //splitting the string into string intoo morse characters
    val chracters = s.split("")

    //interating over morse characters
    for (morseChar in chracters){
        val index =morseChars.indexOf(morseChar)
        //character was found
        if (index != -1){
            message += alphabetChars[index]
        }
    }
    println("the decoded message: $message")
}