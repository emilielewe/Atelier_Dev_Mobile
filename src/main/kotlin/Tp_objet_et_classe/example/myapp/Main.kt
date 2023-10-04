package Tp_objet_et_classe.example.myapp

fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.printSize()
    myAquarium.height = 60
    myAquarium.printSize()
}

fun main() {
    buildAquarium()
}