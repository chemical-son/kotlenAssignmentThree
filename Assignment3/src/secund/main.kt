package secund

fun main() {
    var truck: Truck = Truck()
    truck.printMe()
    truck.printType()

    var van: Van = Van()
    van.printMe()
    van.printType()

    println()

    var sailboat: Sailboat = Sailboat()
    sailboat.printMe()
    sailboat.printType()

    var yacht: Yacht = Yacht()
    yacht.printMe()
    yacht.printType()

    println()

    var helicopter: Helicopter = Helicopter()
    helicopter.printMe()
    helicopter.printType()

    var blimp: Blimp = Blimp()
    blimp.printMe()
    blimp.printType()
}