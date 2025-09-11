fun main(args: Array<String>){
    val  s = "Rhinopotamus"
    println(s.startsWith("rhin"))
    println(s.endsWith("tamus"))
    println(s.contains("pot"))
    println(s.contains("lol"))

    //toUpperCase() and tolowerCase()
    var config = "Fulscreen shadows autosave"
    config = config.toString()
    println("will the game run in Fulscreen?")
    println(config.contains("Fulscreen"))
    println("will shadows be turned on?")
    println(config.contains("shadows"))
    println("will sound be turned off?")
    println(config.contains("nosound"))
    println("will the player like to use autosave?")
    println(config.contains("autosave"))

    //replace
    var strJava = "Java is the best!"
    strJava =strJava.replace("Java","kotlin")
    println(s)
    println("$strJava is ${strJava.length} characters long.")

    //substring()
    println("I would not banish all of these internets.".substring(2, 7))

    //compareTo()
    println("alpha".compareTo("bravo"))
}