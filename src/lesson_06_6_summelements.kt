import kotlin.random.Random

fun main(){
    val arrayGenerator = ArrayGenerator(560117)
    arrayGenerator.printArray()
    println()
    println("Сумма элементов массива: ${arrayGenerator.sum()}")
    println("Среднее арифметическое: ${arrayGenerator.average()}")

}

class ArrayGenerator(var size: Int) {
    private val array: Array <Int>

    init {
        array = generateArray(size)

    }

    fun average(): Double {
        return sum().toDouble() / array.size.toDouble()
    }

    fun sum(): Int {
        var sum = 0
        for (i in array) {
            sum += i
        }
        return sum
    }

    fun printArray() {
        println("Значения массива: ")
        for (i in array.indices) {
            print("${array[i]}")
            if (i < array.size - 1) print(",")
        }
    }

    private fun generateArray(s: Int): Array<Int> {
        val array = Array(s) { 0 }
        for (i in array.indices) {
            array[i] = Random.nextInt(0, 100)
        }
        return array
    }
}