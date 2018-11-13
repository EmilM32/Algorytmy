package algorytmy

fun main(args: Array<String>) {

    println("---------------------")
    println("| Ciąg Fibonacciego |")
    println("---------------------")

    val count = 30
    println("Długość: $count")

    val fibonacci = Fibonacci()
    fibonacci.start(count)
}
class Fibonacci {

    fun start(count: Int) {

        var n1 = 0
        var n2 = 1
        var n3: Int

        print("${n1}_$n2")

        for (i in 2 until count) {
            n3 = n1 + n2
            print("_$n3")
            n1 = n2
            n2 = n3
        }
    }
}