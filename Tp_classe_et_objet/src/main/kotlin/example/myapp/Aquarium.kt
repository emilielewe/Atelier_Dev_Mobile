package example.myapp

class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    var volume: Int
        get() = width * height * length / 1000  // 1000 cm^3 = 1 litre
        set(value) { height = (value * 1000) / (width * length)}
    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
        // 1 litre = 1000 cm^3
        println("Volume: $volume liters")
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

}
