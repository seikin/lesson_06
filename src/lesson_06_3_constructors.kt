fun main(){
    val a = Numberint3(10,5)
    val b = Numberint3(0,1)

    a.inc()

    b.dec()

    println("a: ${a.number}")
    println("b: ${b.number}")
}
/*определение переменных в заголовке класса*/
class Numberint3(var number: Int, var step: Int) {
    fun inc(){
        number += step
    }

    fun dec(){
        number -= step
    }
}