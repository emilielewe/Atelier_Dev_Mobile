package example.myapp

interface FishAction  {
    // Interface qui va venir animer la classe abstraite
    fun eat()
}
interface FishColor {
    val color: String
}
class Requin: FishAction, FishColor  {
    //sous classe de la classe abstraite
    override val color = "gris"
    override fun eat() {
        println("chasse et mange du poisson")
    }
}

class Plecostomus: FishAction, FishColor {
    override val color = "doré"
    override fun eat() {
        println("mangent les algues")
    }
}