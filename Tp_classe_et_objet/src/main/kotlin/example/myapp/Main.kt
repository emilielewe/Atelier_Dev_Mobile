package example.myapp


fun buildAquarium() {
    val aquarium6 = Aquarium(length = 25, width = 10, height = 40)
    //créer un aquarium avec en spécifiant ses dimentions
    aquarium6.printSize() // appelle de la fonction .printSize() de la classe Aquarium
    aquarium6.volume = 70
    //créer un aquarium avec un volume fixé à 70 L
    aquarium6.printSize()
    val myTower = TowerTank(diameter = 25, height = 65) // construction d'un objet aquarium par la classe fille myTower
    myTower.printSize()// appelle de la fonction .printSize() hérité de la classe mère Aquarium
}

fun makeFish() {
    val Requin = Requin()
    println("Le Requin: ${Requin.color}")
    Requin.eat()
    val pleco = Plecostomus()
    println("les Plecostomus: ${pleco.color}")
    pleco.eat()
    println("Plecostomus: ${pleco.color}")
}

fun main() {
    buildAquarium()
    makeFish()
}

