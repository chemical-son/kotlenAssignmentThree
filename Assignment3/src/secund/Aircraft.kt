package secund

abstract class Aircraft: Vehicle() {
    override fun printMe() {
        print("i'm a AirCraft")
    }
}