package example.myapp

abstract class AquariumFish {
    // classe abstraite; qui ne porte pas de fonction propre
    abstract val color: String
}
class Requin: AquariumFish() {
    //sous classe de la classe abstraite
    override val color = "gris"
}

class Plecostomus: AquariumFish() {
    override val color = "doré"
}