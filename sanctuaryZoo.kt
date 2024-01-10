fun main() {
  // Write your code below 🏞
  var responsibilities = listOf ("feed the chimps","play a random game","conduct a health check on Foxie")

  var responsibilitiesComplete = 0
  var timeSpent = 0
  val totalShiftTime = 4
  var foxiesHealthCheck= mutableMapOf<String, Any> ()
  var chimpsHaveEaten = mutableMapOf("Bonnie" to false, "Jubilee" to false, "Fredo" to false, "Foxie" to false)

  //Accomplir la première tache
  println(" First, ${responsibilities[0]}")
  println ("Feeding Bonnie")
  chimpsHaveEaten ["Bonnie"] = true

  println ("Feeding Jubilee")
  chimpsHaveEaten ["Jubilee"] = true

  println ("Feeding Fredo")
  chimpsHaveEaten ["Fredo"] = true

  println ("Feeding Foxie")
  chimpsHaveEaten ["Foxie"] = true

  timeSpent += 3
  responsibilitiesComplete += 1

  println("All chimps have now been fed! \n You\'ve completed $responsibilitiesComplete / ${responsibilities.size} responsibilities")


//Deuxieme tache
println("Next, ${responsibilities[1]}")

var games = setOf ("tug-of-war with a blanket","catch and throw","number game")
var randomGame = games.random()
println("Chimps playing : $randomGame")

timeSpent++
//responsibilitiesComplete++


  println("Each chimp has now played a game of $randomGame! \n You've completed $responsibilitiesComplete / ${responsibilities.size} responsibilities")

  //Troisieme tache

  println("Next, ${responsibilities[2]}")
  foxiesHealthCheck.put("temperature",32.7)
  foxiesHealthCheck.put("mood","Happy")
  println("Foxie has a temperature of ${foxiesHealthCheck["temperature"]} and is feeling ${foxiesHealthCheck["mood"]}")

timeSpent++
responsibilitiesComplete++


  println("You've completed $responsibilitiesComplete / ${responsibilities.size} responsibilities")

if(timeSpent<=totalShiftTime && responsibilitiesComplete==3){
  println("Congrats")
}else if(timeSpent>=totalShiftTime && responsibilitiesComplete==3){
  println("Duties accomplished but you are on overtime")
}else{
  println("All of the responsibilities were not complete and took extra time.")
}

}