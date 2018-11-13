package algorytmy

fun main(args: Array<String>) {

    println("------------------------")
    println("| Sortowanie bąbelkowe |")
    println("------------------------")

    val numbers = intArrayOf(8,2,1,9,5,16,1058,7,5)

    val bubbleSort = Bubblesort()
    bubbleSort.start(numbers)

}

class Bubblesort {

    fun start(numbers: IntArray) {

        var tmpNumbers: Int
        var i: Int
        var flag: Boolean
        val n: Int = numbers.size

        do {
            flag = false
            i = n - 1
            do {
                i--
                if (numbers[i+1] < numbers[i]) {
                    tmpNumbers = numbers[i]
                    numbers[i] = numbers[i + 1]
                    numbers[i + 1] = tmpNumbers
                    flag = true
                }
            } while (i != 0)
        } while (flag)

        for (j in 0 until n) {
            if (j != n-1) {
                print("${numbers[j]}_")
            } else {
                println("${numbers[j]}")
            }
        }
        println("n = $n")
        println("Najniższa wartość: ${numbers.first()}")
        println("Najwyższa wartość: ${numbers.last()}")
    }

}
