fun main() {
  val favoriteColors = mapOf("Jesse" to "Violet", "Megan" to "Red", "Tamala" to "Blue", "Jordan" to "Pink")
  
  println("\n-- Key: Value Output --")
  // Write your code below
  for (favoriteEntry in favoriteColors) {
  println("$favoriteEntry.key}: ${favoriteEntry.value}")
}
  println("\n-- Only Values Output --")
  // Write your code below
  
  for (color in favoriteColors.values) {
  println(color)
}
}