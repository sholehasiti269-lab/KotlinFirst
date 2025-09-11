fun main(args: Array<String>) {
    //character occurence in a sentence analysis
    //the string that we want to analyze
    var s = "A programer gets struck in the shower because the intructions one the shampoo were:lather,wash,and repeat"
    println(s)
    s = s.toString()

    //counters initialization
    var vowelCount = 0
    var consonantCount = 0

    //definition of character groups
    val vowels = "aeiouy"
    val consonants = "bcdfgjklmnpqrstvwxz"

    //main loop
    for (c in s) {
        if (vowels.contains(c))
            vowelCount++
        else if (consonants.contains(c)) {
            consonantCount++

            println("Vowels: $vowelCount")
            println("Consonants: $consonantCount")
            println("Other characters: ${s.length - (vowelCount + consonantCount)}")
        }
    }
}