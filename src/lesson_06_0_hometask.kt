/*hometask Alexey Seikin

1. Создайте класс SampleMath, конструктор которого принимает в себя два целых числа x и y
2. Создайте экземпляр данного класса
3. Реализуйте внутри класса методы для умножения, вычитания, деления и сложения x и y
4. Для функции делеления добавьте обработчик ошибки, который в том случае, если y = 0, вместо деления на ноль будет выполнять деление на единицу
5. Выведети в консоль результаты выполнения каждой из созданных вами функций
Пример входных данных: x = 24, y = 8
Пример результата: сложение - 32, вычитание - 16, умножение - 192, деление - 3
 */
fun main(){
    try {

        print("Введите значение для переменной X: ")
        val x = readLine()!!.toDouble()

        print("Введите значение для переменной Y: ")
        val y = readLine()!!.toDouble()

        val a = SampleMath(x, y)

        a.addition()
        println("Сложение [${a.x} + ${a.y} = ${a.addition()}]")

        a.division()
        println("Деление [${a.x} / ${a.y} = ${a.division()}]")

        a.multiplication()
        println("Умножение [${a.x} * ${a.y} = ${a.multiplication()}]")

        a.subtraction()
        println("Вычитание [${a.x} - ${a.y} = ${a.subtraction()}]")

    } finally {
        println("Программа завершена")
    }
}


class SampleMath(var x: Double, var y: Double){

    fun addition(): Double {
        val add = x + y
        return add
    }

    fun division(): Double {
        if (y == 0.0) {
            val div = x / 1
            return div
        } else {
            val div = x / y
            return div
        }
    }

    fun multiplication(): Double {
        val multi = x * y
        return multi
    }

    fun subtraction(): Double {
        val subtr = x - y
        return subtr
    }

}