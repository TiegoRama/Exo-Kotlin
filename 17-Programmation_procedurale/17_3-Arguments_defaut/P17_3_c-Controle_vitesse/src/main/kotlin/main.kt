fun checkSpeed(speed : Int, limit: Int = 60) {
    if (speed> limit) {
        println("Depasse la limite de ${speed - limit} km/h")
    }
    else{
        println("Dans les limites de vitesses")
    }
}

fun main() {
    checkSpeed(100, 60)
    checkSpeed(40, 90)
    checkSpeed(61)
    checkSpeed(60)
}