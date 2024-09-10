fun main() {
    val a = 6
    var res =""
    if (a % 2 == 0){
        res = "Divisible par 2"
    }
    if (a % 3 == 0){
        res += " Divisible par 3"
}
    if (a % 5 == 0){
        res += " Divisible par 5"
    }
    if (a % 6 == 0){
        res += " Divisible par 6"
    }
    println(res)
}