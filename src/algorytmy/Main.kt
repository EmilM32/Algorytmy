package algorytmy

fun main(args: Array<String>) {

    val numbers = intArrayOf(8,2,1,9,5,16,1058,7,5)

    val bubbleSort = Bubblesort()
    bubbleSort.start(numbers)
    println()

    val fibonacci = Fibonacci()
    fibonacci.start(30)
    println()

    val erastotenes = Erastotenes()
    erastotenes.primesUpTo(30)
    println()

    val euklides = Euklides()
    euklides.start(3, 33)
}