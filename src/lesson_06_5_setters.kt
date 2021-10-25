fun main(){
    val a = numberint5()
    val b = numberint5()

    a.number = 10
    a.step = 5

    a.inc()

    b.dec()
/*get определение обращения к свойству объекта за его значением*/
    /*неявное определение геттера*/
    println()

    println("a: ${a.number}")
    println("b: ${b.number}")
}

class numberint5 {
    /*--*/
    var number = 0
    set(value) {
        field = value
    }
    var step = 2
//        set(v) {
//        if (v % 2 = 0){
//            field == v
//        } else {
//            field = value -1
//            printerror2()
//        }
//    }
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
/*приватная функция призвана обслуживать внутренние дела класа и не может быть вызвана запределами класса*/
    private fun printerror2(){
        println("Шаг был установлен")
    }
}