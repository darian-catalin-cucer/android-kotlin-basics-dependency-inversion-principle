// Example of Dependency Inversion Principle in Kotlin

interface Switchable {
    fun turnOn()
    fun turnOff()
}

class Light : Switchable {
    override fun turnOn() {
        println("Light is on")
    }

    override fun turnOff() {
        println("Light is off")
    }
}

class Fan : Switchable {
    override fun turnOn() {
        println("Fan is on")
    }

    override fun turnOff() {
        println("Fan is off")
    }
}

class Switch(private val device: Switchable) {
    fun turnOn() {
        device.turnOn()
    }

    fun turnOff() {
        device.turnOff()
    }
}

fun main() {
    val light = Light()
    val fan = Fan()
    val switchForLight = Switch(light)
    val switchForFan = Switch(fan)

    switchForLight.turnOn()
    switchForLight.turnOff()

    switchForFan.turnOn()
    switchForFan.turnOff()
}
