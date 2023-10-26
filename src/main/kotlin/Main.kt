import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.concurrent.TimeUnit

fun main(args: Array<String>) {
    showMenu()
}


fun showMenu() {
    val s = "Opciones: "

    println(" ")
    println(s)
    println("-".repeat(s.length))
    println("0- Exit")
    println("1- Create")
    println("2- Update")
    println("3- Insert")
    println("4- Delete")
    println("5- Select")
    introduceNumber() //se ejecuta para introducir uno nuevo
}


private fun introduceNumber() {  //metodo para introducir numeros
    println(" ")
    println("Introdueix un numero (0 per acabar): ")
    val input = BufferedReader(InputStreamReader(System.`in`)).readLine()
    val num = input.toIntOrNull()
    if (num != null) {
        loopNumbers(num)


    } else {
        println("Entrada no valida. Introduix un numero válid.")
        println("")
        showMenu()
    }
}


fun loopNumbers(number: Int) {
    when (number) {
        0 -> { //asi se sale
            System.exit(0)

        }
        1 -> {
            Select()
            showMenu()
        }
        2 -> {
            Update()
            Select()
            showMenu()
        }
        3 -> {
            Insert()
            Select()
            showMenu()
        }
        4 -> {
            Delete()
            Select()
            showMenu()
        }

        else -> {
            Select()
            showMenu()
        }
    }
}
