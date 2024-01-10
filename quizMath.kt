fun main() {
  val quizAnswer1 = 15
  var quizAnswer2 = 3
  val quizAnswer3 = "isosceles"
  val quizAnswer4 = 47

  // Write your code below
  //Première question 75/5
  println ("Quel est le résultat de 75/5")
  var studentAnswer1 = Integer.valueOf(readLine())

  //Question 2 :  75/5
 println ("Quel est la valeur de Y dans 6*2y = 36")
 var studentAnswer2 = Integer.valueOf(readLine())

  //Question 3: Le type de triange qui a deux cotes égales
 println ("Comment appelle t on un triange qui a deux cotes éqales?")
 var studentAnswer3 = readLine()

 //Question 4 : Combien font 8*6 - (3-2)
 println ("Quel est le résultat de 8*6 - (3-2) ?")
 var studentAnswer4 = Integer.valueOf(readLine())

 //Variable pour enregistrer la note
 var points = 0

//Vérification de la première question
if(studentAnswer1 == quizAnswer1){
  points += 25
}
println ("Points après la question 1 : $points")
//Vérification de la seconde question
if (studentAnswer2 == quizAnswer2){
  points += 25
}else if (studentAnswer2 in (quizAnswer2-- .. quizAnswer2++)){
  println("The answer $studentAnswer2 is within 1 point of $quizAnswer2")
  points+= 20
}else{
  points+=1}
  println ("Points après la question 2 : $points")

//Vérification de la troisième question
if (studentAnswer3 == quizAnswer3){
  points += 25
}else if (studentAnswer3 == "equilateral"){
  points+= 10
}else{
points+=1}
println ("Points après la question 3 : $points")
//Vérification de la quatrième question
if (studentAnswer4 == quizAnswer4){
  points += 25
}else if (studentAnswer4 in (44..54)){
  points+= 20
}else{
points+=1}

//Déterminer la note finale
println("Points finaux : $points")
when(points){
  in 0..59   -> println("The student received an F")
  in 60..69  -> println("The student received an D")
  in 70..79  -> println("The student received an C")
  in 80..89  -> println("The student received an B")
  in 90..100 -> println("The student received an A")
  in 101..110 -> println("The student received an A+")
}

}//Fin de la fonction main
