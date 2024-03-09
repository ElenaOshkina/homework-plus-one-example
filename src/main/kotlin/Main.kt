fun main(args: Array<String>) {
    val options = arrayOf("Камень", "Ножницы", "Бумага")

    val gameChoice = computerChoiceGenerator(options)
    val userChoice = getPlayerChoice(options)
}

fun getPlayerChoice(optionsParam: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""

    //выполнить цикл, пока пользователь не введет допустимый вариант
    while (!isValidChoice) {
        print("Введите один из вариантов ")

        for (item in optionsParam)
            print(" $item")
        println(".")

        //Прочитать ввод пользователя
        val userInput = readLine()
        //Проверяем пользовательский ввод
        if (userInput != null && userInput in optionsParam) {
            isValidChoice = true
            userChoice = userInput
        }
        //если выбран недопустимый вариант, сообщить пользователю
        if(!isValidChoice) println("Вам нужно выбрать значение из предложенного списка")
    }
    return userChoice
}

fun computerChoiceGenerator(optionsParam: Array<String>) =
    optionsParam[(Math.random() * optionsParam.size).toInt()] //0.0 до 1.00