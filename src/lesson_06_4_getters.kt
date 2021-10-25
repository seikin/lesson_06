fun main(){
    val a = numberint4()
    val b = numberint4()

    a.number = 10
    a.step = 5

    a.inc()

    b.dec()
/*get определение обращения к свойству объекта за его значением*/
    /*неявное определение геттера*/
    println("a: ${a.number}")
    println("b: ${b.number}")
}

class numberint4 {
/*явное определение геттера для свойства number
* сколько в классе свойств столько и геттеров
* описывает что нужно сделать со значением поля,
* прежде чем его вернуть*/
    var number = 0
            get() { return field}
    var step = 1
            get() { return field}
    val stepisnotone: Boolean
    get() {
        return step != 1
    }

    fun inc(){
        number += step
    }

    fun dec(){
        number -= step
    }
}