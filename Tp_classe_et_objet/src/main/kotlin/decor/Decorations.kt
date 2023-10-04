package example.myapp.decor

data class Decorations (val rocks: String){
    // création d'une classe de données
}

data class Decoration2(val rocks: String, val wood: String, val diver: String){
    // cette classe de données prend directement les paramettres que kotlin va utiliser en créant directement pour chaque vaentrée une variable.
}

enum class Color(val rgb: Int) {
    // chaque élément dans cette classe est un objet.
    ROUGE(0xFF0000), VERT(0x00FF00), BLEU(0x0000FF);
}
enum class Direction(val degrees: Int) {
    NORD(0), SUD(180), EST(90), OUEST(270)
}