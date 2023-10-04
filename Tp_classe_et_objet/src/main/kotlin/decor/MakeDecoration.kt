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

    val d5 = Decoration2("diamant", "bibinga", "gravier")
    println(d5)

    // Assignation de chaque propriété à une variable.
    val (rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)
    // ici ce sont les varables qui sont dans le code. ces dernières sont fonction de l'entrée initiale dans Décoration.
}