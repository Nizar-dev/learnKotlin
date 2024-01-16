class Calculator(val name:String){


  init{
    println("$name")
  }
  
  //fonction retourne la somme des deux paramètres
  fun add(a:Int, b:Int):Int{
    return(a + b)
  }

//fonction retourne la différence entre deux paramètres
  fun substract(a:Int, b:Int):Int{
    return(a - b)
  }


//fonction retourne le produit des deux paramètres
  fun multiply(a:Int, b:Int):Int{
    return(a * b)
  }


//fonction retourne le quotien des deux paramètres
  fun divide(a:Int, b:Int):Int{
    if (b==0){
      println ("La division par 0 est interdite!")
      return 1
    }
    return(a / b)
  }



//fonction retourne le premier paramètre élevé à la puissance du second paramètre
  fun power(a:Int, b:Int):Int{
    var p = 1
    if (b==0){
      return 1
    }else{
      for (i in 1..b){
        p = p * a
      }
    }
    return(p)
  }

}



fun main(){
val cal = Calculator("Codey")
println("La somme de 2 et 5 : ${cal.add(2,5)}")
println("La différence entre 4 et 5 : ${cal.substract(4,5)}")
println("Le produit de 2 et 5 : ${cal.multiply(2,5)}")
println("Le quotient de 2 et 5 : ${cal.divide(2,5)}")
println("2 puissance  3 : ${cal.power(2,3)}")

}