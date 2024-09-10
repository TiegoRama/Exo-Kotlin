fun main() {
        val a = "hello"

        val lettreutilise = a.toCharArray().toSet()
        val alphabet = ('a'..'z').toSet()

        val res = alphabet - lettreutilise

        println(res)
    }


