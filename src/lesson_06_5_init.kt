fun main(){
    val a = NumberInt05(10,8)
    a.inc()


}

/*как можно обработать входные данные, если нет setter*/
class NumberInt05 (n: Int, s: Int){
    var number = n
    /*делаем val step приватной для запрета доступа из вне*/
    private var step = 2
    /*основной конструктор не может содержать в себе исполняемого кода*/

    init {
        if (s % 2 ==0){
            step = s
        } else {
            step = s - 1
            printError()
        }

    }

    fun inc(){
        number += step
    }

    fun dec(){
        number -= step
    }
    private fun printError(){
        println("Значение изменено ")

    }

}