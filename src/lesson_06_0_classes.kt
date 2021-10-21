fun main(){
    /*создаем новый экземпляр класса NumberInt*/
    val a = NumberInt()
    val b = NumberInt()
    /*присваиваем экземпляру a класса NumberInt свойство number*/
    a.number = 10
    a.step = 5

    /*вызываем функцию для нашего экземпляра класса*/
    a.inc()
    b.dec()

    println("a: ${a.number}")
    println("b: ${b.number}")

}

class NumberInt {
    var number = 0
    var step = 1

    fun inc(){
        number += step
    }

    fun dec(){
        number -= step
    }
}