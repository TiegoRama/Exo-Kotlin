import kotlin.math.pow
import kotlin.math.hypot
fun perimeter(x1: Double = 0.0 , y1: Double= 0.0, x2: Double= 0.0, y2: Double= 0.0, x3: Double= 0.0, y3: Double= 0.0, x4: Double= 0.0, y4: Double= 0.0): Double {
    val xy = Math.hypot((x2-x1),(y2-y1)) + Math.hypot((x4-x3),(y4-y3)) + Math.hypot((x3-x2),(y3-y2))
    return xy
}

fun main() {
    println(perimeter(0.0, 0.0, 12.0, 0.0, 0.0, 5.0))
}

/*(x.pow(2)+y.pow(2)).pow(0.5)*/