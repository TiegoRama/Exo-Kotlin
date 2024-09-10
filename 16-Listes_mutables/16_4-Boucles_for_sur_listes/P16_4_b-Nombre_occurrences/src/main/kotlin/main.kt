fun main() {
    val n = arrayOf(6, 1, 2, 3, 4, 2, 1, 2)
    val m = 1
    var compteur = 0
    for (i in 0 until n.size) {
        if (n[i] == m) {
            compteur += 1
        }
    }
    println(compteur)
}

