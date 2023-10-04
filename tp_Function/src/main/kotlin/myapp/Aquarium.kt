package example.myapp

class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
    }
    init {
        println("aquarium initializing")
    }
    init {
        // 1 litre = 1000 cm^3
        println("Volume: ${width * length * height / 1000} liters")
    }
    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 par poisson + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1
    }
}
