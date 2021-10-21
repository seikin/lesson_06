import kotlin.random.Random

/*считаем сумму элементов в массиве*/
fun main(){

}

class ArrayGenerator(var size: Int){
    init {
        val array = generateArray(size)

    }

    private fun generateArray(s: Int): Array<Int> {
        val array = Array(s) {0}
        for (i in array.indices){
            array[i] = Random.nextInt(0,100)
        }
        return array
    }
}