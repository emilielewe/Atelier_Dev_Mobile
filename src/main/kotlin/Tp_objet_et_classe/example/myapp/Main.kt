package Tp_objet_et_classe.example.myapp

fun buildAquarium() {
    //val myAquarium = Aquarium()
    //myAquarium.printSize()
    //myAquarium.height = 60
    //myAquarium.printSize()

    val aquarium1 = Aquarium()
    aquarium1.printSize()
    val aquarium2 = Aquarium(width = 25)
    aquarium2.printSize()
    val aquarium3 = Aquarium(height = 35, length = 110)
    aquarium3.printSize()
    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
    aquarium4.printSize()

}

fun main() {
    buildAquarium()
}