// Write your code below
//Fonction pour collecter une liste d'entiers'
fun getListOfNumbers():List<Int>{
  var myList= mutableListOf<Int>()
    for(i in 1..7){
      println("Veuillez saisir un entier !")
      myList.add(Integer.valueOf(readLine()))
    }
    return myList
}

//Fonction déterminant la valeur maximale d'une liste passee en parametre
fun findMax(liste: List<Int>):Int{
  var largestNumber=liste[0]
  for(i in 0..liste.size-1){
    if (liste[i]>largestNumber){
      largestNumber = liste[i]
    }

  }
  return largestNumber
}

//Fonction cherchant le plus petit nombre de la liste passée en argument
fun findMin(liste: List<Int>):Int{
  var smallestNumber=liste[0]
  for(i in 0..liste.size-1){
    if (liste[i]<smallestNumber){
      smallestNumber = liste[i]
    }

  }
  return smallestNumber
}
// Fonction déterminant la valeur moyenne d'une liste passée en argument
fun findAverage(liste: List<Int>):Int{
  var sum = 0
  for(i in liste){
    sum+=i
  }
  return sum/liste.size
}

// Fonction déterminant si l'argument 1 existe dans la  liste passée en 2me argument
fun checkIfListContains(entier:Int,liste: List<Int>):Boolean{
  
  for(i in liste){
    if(entier==i){
      return true
    }
  }
  return false
}


//FONCTION MAIN
fun main() {
  // Write more code below
  var values = getListOfNumbers()
  println(values)
  var largestValue = findMax(values)
  println ("The largest number is $largestValue")
  var smallestValue = findMin(values)
  println ("The smallest number is $smallestValue")
  var average= findAverage(values)
  println ("The average of that list is $average")
  println ("Veuillez saisir un entier à vérifier dans la liste")
  var numToFind = Integer.valueOf(readLine())
  var containsValue = checkIfListContains(numToFind,values)
  if(containsValue){
    println ("$numToFind existe bien dans la liste $values")
  }else{
    println ("$numToFind n'existe pas dans la liste $values")
  }

}

