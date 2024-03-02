fun main(args: Array<String>) {
    val options = arrayOf("Камень", "Ножницы", "Бумага")

    val gameChoice = computerChoiceGenerator(options)
    val userChoice = getPlayerChoice(options)
}

fun getPlayerChoice(optionsParam: Array<String>): String {
    print("Введите один из вариантов ")

    for (item in optionsParam)
        print("$item ")
    println(".")

    //Прочитать ввод пользователя
    val userInput = readLine()

    if (userInput != null && userInput in optionsParam) {
        return userInput
    }
    return "todo"
}

fun computerChoiceGenerator(optionsParam: Array<String>) =
    optionsParam[(Math.random() * optionsParam.size).toInt()] //0.0 до 1.00