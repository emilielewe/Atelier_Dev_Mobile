package example.myapp

interface FishAction  {
    // Interface qui va venir animer la classe abstraite
    fun eat()
}
interface FishColor {
    val color: String
}
object GoldColor : FishColor {
    // création de l'objet "GoldColor" qui portera toujours le parametre couleur = doré
    override val color = "doré"
}
class PrintingFishAction(val nourriture: String) : FishAction {
    // classe qui permet de spécifier le type de nourriture en entrée et exécute la fonction eat()
    override fun eat() {
        println(nourriture)
    }
}
class Requin: FishAction, FishColor  {
    //sous classe de la classe abstraite
    override val color = "gris"
    override fun eat() {
        println("chasse et mange du poisson")
    }
}

class Plecostomus: FishAction, FishColor by GoldColor {
    // utilisation de la délégation de FishColor à GoldColor. Ici plus besoin de préciser la couleur dans la sous classe.
    override fun eat() {
        println("eat algae")
    }
}
