
fun main(args: Array<String>) {
    // 1. EXPLORE THE MAIN FUNCTION
 //  println("Hello, world!")
 //   println("Hello, ${args[0]}")

    // 2. LEARN WHY EVERYTHING HAS A VALUE

    //   val isUnit = println("This is an expression")
    //   println(isUnit)
    //   val temperature = 10
    //   val isHot = if (temperature > 50) true else false
    //   println(isHot)
    val temperature = 10
    val message = "The water temperature is ${ if( temperature > 50) "too warm" else "OK"}."
    println(message)
}


