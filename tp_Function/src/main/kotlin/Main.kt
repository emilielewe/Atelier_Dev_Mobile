// Activité 3.1
import java.util.* // Importer ce module afin d'utiliser les fonctions Random() et nextInt()

// Fonction randomDay, qui choisi un jour au hazard parmi les éléments du tableau week
fun randomDay() : String {
  val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
    "Friday", "Saturday", "Sunday")
  return week[Random().nextInt(week.size)]
  //la fonction retourne un jours, qui est choisi par son index et restrein à une plage de valeur par la fonction nextInt().
}

// Activité 3.2
//Fonction qui prend en argument une chaîne de caractères ; $day,  et donne en sortie une autre chaîne de caractères; $food. Ici le paramètre est obligatoire.
fun fishFood (day : String) : String {
  // La structure conditionnelle "when" vas s'arrêter à une condition dès que celle-ci est vérifiée et continuer l'exécution du programme.
  return  when (day) {
    "Monday" -> "flakes"
    "Tuesday" -> "pellets"
    "Wednesday" -> "redworms"
    "Thursday" -> "granules"
    "Friday" -> "mosquitoes"
    "Saturday" -> "lettuce"
    "Sunday" -> "plankton"
    else -> "nothing"
  }
  // le ccde est plus compact ainsi.
}

fun feedTheFish() {
  val day = randomDay()
  val food = fishFood(day)

  println ("Today is $day and the fish eat $food")
}

//Activite 4.1
fun swim(speed: String = "fast") {
  println("swimming $speed")
}

//Activite 4.2
fun shouldChangeWater (day: String, temperature: Int = 20, dirty: Int = 25): Boolean {
  return when {
    temperature > 30 -> true
    dirty > 30 -> true
    day == "Sunday" ->  true
    else -> false
  }
}
fun feedTheFish2() {
  val day = randomDay()
  val food = fishFood(day)
  println ("Today is $day and the fish eat $food")
  println("Change water: ${shouldChangeWater(day)}") // la fonction shouldChangeWater a besoin du paramètre 'day' pour fonctionner.
  println("Change water again: ${shouldChangeWater1(day)}")
}

//Activite 4.3
fun isTooHot(temperature: Int) = temperature > 30
// fonction isToHot qui prent en entrée un nombre ( températeure) et, suivant une condition( >30) affiche un booléen
fun isDirty(dirty: Int) = dirty > 30
// fonction isToHot qui prent en entrée un nombre ( dégré de saleté ) et, suivant une condition( >30) affiche un booléen
fun isSunday(day: String) = day == "Sunday"
// fonction isToHot qui prent en entrée une chaîne de caractère ( jour ) et, suivant une condition( day == "Sunday) affiche un booléen

fun shouldChangeWater1 (day: String, temperature: Int = 52, dirty: Int = 20): Boolean {
  return when {
    isTooHot(temperature) -> true
    isDirty(dirty) -> true
    isSunday(day) -> true
    else  -> false
  }
}

//Activité 5.1 les filtre
val decorations = listOf ("rock", "pagoda","ananas","orange", "plastic plant", "alligator", "flowerpot") // création d'une liste non muable

fun main(args: Array<String>) {
  feedTheFish()
  swim()   // utilise en paramettre la vitesse par defaut
  swim("slow")   // parametre spécifié
  swim(speed="turtle-like")   // parametre nomminal
  feedTheFish2()
  // appelle et exécution des  fonctions créées
  println( decorations.filter {it[0] == 'r'}) // affiche les éléments qui commencent par "r" uniquement
  println( decorations.filter {it[2] == 'g' }) // affiche les éléments qui commencent par "r" uniquement
  println( decorations.filter {it[2] == 'a' }) // affiche les éléments qui commencent par "r" uniquement
}


