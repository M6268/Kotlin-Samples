package day3.thread

class Task3 :Thread()
{
    override fun run() {
        super.run()
        for (i in 0..10) {
            println("Task 3 ${i*10} %")
            Thread.sleep(1000)
        }
    }
}