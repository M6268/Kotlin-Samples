package day3.thread

fun main(args: Array<String>) {
    val t1 = Task1()
    val t2 = Task2()
    val t3 = Task3()

    t1.start()
    t2.start()
    t3.start()
}