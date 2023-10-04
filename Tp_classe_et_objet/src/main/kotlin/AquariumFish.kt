package example.myapp

abstract class AquariumFish {
    // classe abstraite; qui ne porte pas de fonction propre
    abstract val color: String
}
interface FishAction  {
    // Interface qui va venir animer la classe abstraite
    fun eat()
}
class Requin: AquariumFish() {
    //sous classe de la classe abstraite
    override val color = "gris"
    fun eat() {
        println("chasse et mange du poisson")
    }
}

class Plecostomus: AquariumFish() {
    override val color = "doré"
    fun eat() {
        println("mangent les algues")
    }
}