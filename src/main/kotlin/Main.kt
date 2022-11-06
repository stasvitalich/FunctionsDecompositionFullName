// Программа наглядно показывает принцип декомпозиции функций.
// Программа принимает на вход 2 переменных: Имя и Фамилию,
// а потом выдаёт ваше полное имя.

fun createFullName(firstName: String, lastName: String): String { // Объявляем новую функцию,
    return ("$firstName $lastName") // которая принимает на вход 2 строковых переменных: имя и фамилию.
}

fun main() { // Объявляем общую функцию.
    println("Write the first name:")      // Просим пользователя ввести имя.
    var firstName = readLine().toString() // Считываем введённое имя с клавиатуры.
    println("Write the last name:")       // Просим пользователя ввести фамилию.
    var lastName = readLine().toString()  // Считываем введённую фамилию с клавиатуры.
    print("Your full name is: ")          // Добавляем строку для наглядности.
    println(createFullName(firstName, lastName)) // Распечатываем созданную функцию и указываем, какие аргументы
                                                 // функция приняла на вход.
}