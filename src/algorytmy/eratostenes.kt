package algorytmy

fun main(args: Array<String>) {

    println("---------------------")
    println("| Sito Eratostenesa |")
    println("---------------------")

    val x = 300

    val erastotenes = Erastotenes()
    erastotenes.primesUpTo(x)

}
class Erastotenes {

    fun primesUpTo(max: Int) {
        tailrec fun start(primes: List<Int>, possiblePrimes: List<Int>): List<Int> =
                when {
                    possiblePrimes.isEmpty() -> primes
                    else -> {
                        val prime = possiblePrimes.first()
                        val sievedPossiblePrimes = possiblePrimes.filter { it % prime != 0 }
                        start(primes + prime, sievedPossiblePrimes)
                    }
                }

        val result = start(emptyList(), (2 .. max).toList())
        return print(result)
    }
}