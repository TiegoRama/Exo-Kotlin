// write your function here
fun isVowel(lettre: Char) {
    val voyelle = listOf ('A','E','I','U','O','Y')
    val majuscule = lettre.toUpperCase()
    println(voyelle.contains(majuscule) )
}
fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}
