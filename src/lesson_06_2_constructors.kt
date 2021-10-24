fun main(){
    /*созданы объекты. это экземпляр класса numberint
    * объект можно создать только путем вызова констрктора данного класса*/
    val a = Numberint2(10,5)
    val b = Numberint2(0,1)

    a.inc()

    b.dec()

    println("a: ${a.number}")
    println("b: ${b.number}")
}
/*первичный конструктор. параметры вынесенные в заголовок класса
* class Numberint2(n: Int, s: Int) - class Numberint2()*/
class Numberint2() {
    var number: Int = 0
    var step: Int = 1

    /*конструкторы, определенные в теле класса называются вторичными*/
    constructor(n: Int, s: Int) : this() {
        number = n
        step = s
    }

    fun inc(){
        number += step
    }

    fun dec(){
        number -= step
    }
}