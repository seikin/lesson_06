/*setter - зачем он нужен?*/
fun main(){
    /*создаем новый экземпляр класса NumberInt*/
    val a = NumberInt04()
    val b = NumberInt04()
    /*присваиваем экземпляру a класса NumberInt свойство number*/
    a.number = 10
    a.step = 5

    /*вызываем функцию для нашего экземпляра класса*/
    a.inc()
    b.dec()

    /*автоматически созданный getter - number. явно указыват его есть смысл, при необходимости его обработки*/
    println("a: ${a.number}")
    println("b: ${b.number}")
    println("step: ${a.step}")

}

class NumberInt04 {
    /*number - это свойство класса*/
    var number = 0
        /*сколько в классе свойств - столько и getter*/
        /*ключевое слово field нужно при указании исходного геттера*/
        set(value){
            field = value
        }
/* step сделали четным числом*/
    var step = 2
        get(){return field}
    set(value) {
        if (value % 2 == 0 ){
            field = value
        } else {
            field = value-1
            /*выводить println в сеттере не очень красиво*/
            println("Шаг был установлен на единицу меньше")
        }
    }

    val stepisnotOne: Boolean
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