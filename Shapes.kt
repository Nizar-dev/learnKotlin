fun main() {
  // Square Variables
  val sqSide = 7
  val sqChar1 = "X  "
  val sqChar2 = "O  "
  
  // Write your code below to draw a square

  for (i in 1..sqSide){
    for (j in 1..sqSide){
      if ((i%2==0 && j%2==0)|| (i%2!=0 && j%2!=0)){
      print(sqChar1)
    }else{
      print(sqChar2)
    }
    }
    println()
  }

  

  // Triangle Variables
  var triRows = 10
  var triCount = 0
  var triRowLen = triRows
  val triChar1 = "/  "
  val triChar2 = "   "
  
  // Code creating a plain triangle
  println("\n\n\n Plain Triangle \n\n\n")
  for (i in triRows downTo 1 ){
    while(triCount<triRowLen){
      print(triChar1)

      triCount++
    }
    triCount=0
    triRowLen--
    println()
  }

  //Code creant un triangle creux

  println("\n\n\n Triangle with Outline Pattern only")
    triRows = 10
    triRowLen = triRows
    
    for (i in triRows downTo 1 ){
      while(triCount<triRowLen){
        triCount++
        if((triCount!=1) && (triCount!= triRowLen) && (i!=triRows)){
          print(triChar2)
        }else{
          print(triChar1)
        }

        
    }
    
    triCount=0
    triRowLen--
    println()
  } 
}