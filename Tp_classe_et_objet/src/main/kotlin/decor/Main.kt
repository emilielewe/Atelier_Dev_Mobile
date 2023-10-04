package example.myapp.decor

fun main(){
    makeDecorations()
    // comme les singletons, il n'y a qu'une seule valeur pour chaque objet de la classe.
    println(Direction.EST.name)
    println(Color.ROUGE.name)

    println(Direction.NORD.name)
    println(Color.BLEU.name)
}