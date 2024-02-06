//s'entrainer à utiliser les fonctions


fun main(){

	//Souhaiter un bon anniversaire sans spécifier la cible
	println(textGreeting())
	//Souhaiter bon anniversaire à Hancha pour son 34eme anniversaire
	greetingsBirthday("Hancha",34)
	//Souhaiter bon anniversaire à Bellouche pour son 42eme anniversaire
	println(textGreeting(age=42, nom = "Bellouche"))
}

// Souhaiter bon anniversaire 
fun greetingsBirthday(nom:String, age:Int){

	println ("Joyeux anniversaire $nom. Tu as dorenavant $age ans.")
}


//Souhaiter l'anniversaire en renvoyant une chaine de caractère
fun textGreeting(nom:String = "Nizar", age:Int = 19):String{
	return("Joyeux anniversaire " + nom +". Tu as dorenavant " + age + " ans.")
}