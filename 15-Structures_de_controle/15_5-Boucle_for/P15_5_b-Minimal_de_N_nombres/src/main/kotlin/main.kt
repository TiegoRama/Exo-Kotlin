
    fun main() {
        var n = mutableListOf(2, 5, 4, 8, 7, 6,1,0)
        var res = n[0]
        for (i in 1 ..<  n.size) {
            if (n[i] < res) {
                res = n[i]
            }
        }
        println(res)
    }


