fun main(){
    /*Передаем значения в экземпляр класса сразу.
    Это выражение будет работать,если в свойство самого класса внести добавления*/
    val a = NumberInt01(10,5)
    val b = NumberInt01(0,1)

    /*вызываем функцию для нашего экземпляра класса*/
    a.inc()
    b.dec()

    println("a: ${a.number}")
    println("b: ${b.number}")

}
/*Это вторичный конструктор, а не параметры, как у функций*/
class NumberInt01 {
    var number: Int
    var step: Int

    constructor(n: Int, s: Int){
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