package example.myapp.decor

fun makeDecorations() {
    val decoration1 = Decorations("granite")
    println(decoration1)
    val decoration2 = Decorations("slate")
    println(decoration2)
    val decoration3 = Decorations("slate")
    println(decoration3)

    println (decoration1.equals(decoration2))
    println (decoration3.equals(decoration2))
}