/*getter эта особая функция, которая присваевается к свойству, после которого и упоминается*/
fun main(){
    /*создаем новый экземпляр класса NumberInt*/
    val a = NumberInt03()
    val b = NumberInt03()
    /*присваиваем экземпляру a класса NumberInt свойство number*/
    a.number = 10
    a.step = 5

    /*вызываем функцию для нашего экземпляра класса*/
    a.inc()
    b.dec()

    /*автоматически созданный getter - number. явно указыват его есть смысл, при необходимости его обработки*/
    println("a: ${a.number}")
    println("b: ${b.number}")

}

class NumberInt03 {
    /*number - это свойство класса*/
    var number = 0
        /*сколько в классе свойств - столько и getter*/
        /*ключевое слово field нужно при указании исходного геттера*/
    get(){return field}

    var step = 1
    get(){return field}

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