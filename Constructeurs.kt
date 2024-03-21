import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty




 open class SmartDevice protected constructor(val name: String, val category: String){
	var deviceStatus = "Online"
		protected set(value){
		field = value
		}

	open val deviceType = "Unknown"
	constructor(name: String, category: String, stutusCode: Int) : this(name,category){
		deviceStatus = when(stutusCode){
			0 -> "Offline"
			1 -> "Online"
			else -> "Unknown"
		}
	}
	open fun turnOn() {
        // function body
        deviceStatus = "on"
    }

    open fun turnOff() {
        // function body
        deviceStatus = "off"
    }

}


// Une sous classe smartTvDevice qui étend la classe SmartDevice

class SmartTvDevice(deviceName: String, deviceCategory: String) : SmartDevice
(name= deviceName, category= deviceCategory){

	override val deviceType = "Smart TV"

	private var speakerVolume by RangeRegulator(initialValue = 2, minValue = 0, maxValue = 100)
	private var channelNumber by RangeRegulator(initialValue = 1, minValue = 0, maxValue = 200)
		

	// Fonction d'augmentation de volume
	fun increaseSpeakerVolume(){
		speakerVolume++
		println("Speaker volume increased to $speakerVolume")
	}

	//Méthode qui zappe la chaine
	 fun nextChannel(){
		channelNumber++
		println("Channel number increased to $channelNumber")
	}

	//Méthode pour allumer la tv
	override fun turnOn() {
        super.turnOn()
        println(
            "$name is turned on. Speaker volume is set to $speakerVolume and channel number is " +
                "set to $channelNumber."
        )
    }

    //Méthode pour éteindre la tv
    override fun turnOff() {
        super.turnOff()
        println("$name turned off")
    }
}


// Sous Classe qui étend la classe SmartDevice et définit un appareil d'éclairage intelligent

class SmartLightDevice(deviceName: String, deviceCategory: String) : SmartDevice(name = deviceName,
	category = deviceCategory){

	override val deviceType = "Smart Light"

	private var brightnessLevel by RangeRegulator(initialValue = 0, minValue = 0, maxValue = 100)

	// Méthode qui augmente la luminosité de l'éclairage
	fun increaseBrightness(){
		brightnessLevel++
		println("brightness increased to $brightnessLevel.")
	}

	// Méthode pour allumer l'appareil intelligent
	override fun turnOn() {
        super.turnOn()
        brightnessLevel = 2
        println("$name turned on. The brightness level is $brightnessLevel.")
    }
	
	// Méthode pour éteindre l'appareil intelligent
	override fun turnOff() {
        super.turnOff()
        brightnessLevel = 0
        println("Smart Light turned off")
    }
}

// Une classe pour une maison connectee qui contient plusieurs objets intelligents
class SmartHome(
	val smartTvDevice: SmartTvDevice,
	val smartLightDevice : SmartLightDevice
	){


	var deviceTurnOnCount = 0
		private set 
	
	//Une méthode pour allumer la télé
	fun turnOnTV(){
		deviceTurnOnCount++
		smartTvDevice.turnOn()
	}


	//Une méthode pour éteindre la télé
	fun turnOffTv(){
		deviceTurnOnCount--
		smartTvDevice.turnOff()
	}

	//Une méthode pour augmenter le volume de la télé
	fun increaseTvVolume(){
		smartTvDevice.increaseSpeakerVolume()
	}

	//Une méthode pour zapper
	fun changeTvChannelToNext(){
		smartTvDevice.nextChannel()
	}

	fun turnOnLight() {
		deviceTurnOnCount++
        smartLightDevice.turnOn()
    }

    fun turnOffLight() {
    	deviceTurnOnCount--
        smartLightDevice.turnOff()
    }

    fun increaseLightBrightness() {
        smartLightDevice.increaseBrightness()
    }

    fun turnOffAllDevices() {
        turnOffTv()
        turnOffLight()
    }



}

// Une classée déléguée pour réguler les valeurs des propriétés des appareils intelligents
class RangeRegulator(
    initialValue: Int,
    private val minValue: Int,
    private val maxValue: Int
) : ReadWriteProperty<Any?, Int> {

    var fieldData = initialValue

    override fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return fieldData
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        if (value in minValue..maxValue) {
            fieldData = value
        }
    }
}


fun main() {
    var smartDevice: SmartDevice = SmartTvDevice("Android TV", "Entertainment")
    smartDevice.turnOn()

    smartDevice = SmartLightDevice("Google Light", "Utilitaire")
    smartDevice.turnOn()
}

