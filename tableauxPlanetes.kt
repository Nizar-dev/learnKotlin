fun main(){
	var rockPlanets = arrayOf<String>("Mercury","Venus","Earth","Mars")
	var gasPlanets  = arrayOf("Jupiter","Saturn","Uranus","Neptune")
	val solarSystem = rockPlanets + gasPlanets
	print("Les rocheuses: ")
	for(i in 0..rockPlanets.size-1){
		print("${rockPlanets[i]} ")
		} 
	println("\n---------------")
	print("Les gazeuses : ")
	for(i in 0..gasPlanets.size-1){
		print("${gasPlanets[i]} ")
		} 
	println("\n---------------")
	print("Le système solaire: ")
	for(i in 0..solarSystem.size-1){
		print("${solarSystem[i]} ")
		} 
	
}