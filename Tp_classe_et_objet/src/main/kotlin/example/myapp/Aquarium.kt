package example.myapp

import java.lang.Math.PI

open class Aquarium(var length: Int = 100, var width: Int = 20, open var height: Int = 40) {
    // le mot  clé "open" permettra de créer une sous classe dans la classe aquarium
    open var volume: Int
        get() = width * height * length / 1000  // 1000 cm^3 = 1 litre
        set(value) { height = (value * 1000) / (width * length)}
    // Ici le volume pourra être utilisé partout et modifié partout dans le code car les variable son par défaut publique.
    fun printSize() {
        println("Largeur: $width cm " +
                "Longueur: $length cm " +
                "hauteur: $height cm ")
        // 1 l = 1000 cm^3
        println("Volume: $volume litres; Eau: $water litres (${water / volume * 100.0}% plein)")
    }
    init {
        println("aquarium initializing")
    }
    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 par poisson + espace supplémentaire pour que l'eau ne coule pas
        val tank = numberOfFish * 2000 * 1.1
        // calcul de la hauteur necessaire
        height = (tank / (length * width)).toInt()
    }
    open val shape = "rectangle"
    open var water: Double = 0.0
        get() = volume * 0.9
}

class TowerTank (override var height: Int, var diameter: Int): Aquarium(height = height, width = diameter, length = diameter) {
    override var volume: Int
        // aire de l'éllipse = π * r1 * r2
        get() = (width/2 * length/2 * height / 1000 * Math.PI).toInt()
        set(value) {
            height = ((value * 1000 / Math.PI) / (width/2 * length/2)).toInt()
        }
    override var water = volume * 0.8
    override val shape = "cylinder"
}

