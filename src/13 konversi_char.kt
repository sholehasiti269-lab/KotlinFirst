fun main(args: Array<String>){
    // ASCII value
    var c: Char //character
    var i: Int //ordinal (ASCII) value of the character
    //conversion from text to ASCII value
    c = 'a'
    i = c.toInt()
    println("The character $c was converted to ASCII value of $i")

    //conversion from on ASCII value to text
    i = 98
    c = i.toChar()
    println("The ASCII value of $i was coverted to its textual value of $c")
}