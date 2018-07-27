package day1

fun main(args: Array<String>) {
    print("Enter a number :")
    val a: Int = readLine()?.toIntOrNull() ?: 0;
    if (a == 0)
        println("Please Enter a non-zero number")
    else {
        if (a % 2 == 0)
            println("$a Is Even")
        else
            println("$a Is Odd")
    }
}