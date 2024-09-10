fun main() {
    val n = listOf(3,1,3,2,3)
    var res = n[0]
    var reponse = ""
    var compteur = 0
    for(i in 1..<n.size ){
    if(res == n[i]){
        reponse = "YES"
        compteur += 1
    }
    }
    if (compteur >= 2){
        println(reponse)
    }
    else{
        println("NO")
}
}
