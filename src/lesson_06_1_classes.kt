fun main(){
    /*создан объект. это экземпляр класса numberint*/
    val a = numberint()
    val b = numberint()

    /*установили свойства для объекта а*/
    a.number = 10
    a.step = 5

    /*вызов функции-члена. вызывается только через объект данного класса. данные берет не по умолчанию*/
    a.inc()

    /*функция член выполнена со значениями по умолчанию, указанными ы теле класса*/
    b.dec()

    println("a: ${a.number}")
    println("b: ${b.number}")
}

class numberint {
    var number = 0
    var step = 1

    fun inc(){
        number += step
    }

    fun dec(){
        number -= step
    }
}