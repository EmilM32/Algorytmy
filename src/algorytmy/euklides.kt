package algorytmy

fun main(args: Array<String>) {

    println("----------------------")
    println("| Algorytm Euklidesa |")
    println("----------------------")

    val x = 33
    val y = 3

    val euklides = Euklides()
    euklides.start(x, y)

}
class Euklides {

    fun start(x: Int, y: Int) {
        var a: Int = x
        var b: Int = y

        while (a != b) {
            if (a < b) {
                b -= a
            } else {
                a -= b
            }
        }
        print("Największy wspólny dzielnik dla liczb $x i $y: $a")
    }
}