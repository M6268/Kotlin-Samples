package day3.thread

class Task2 : Thread() {
    override fun run() {
        super.run()
        for (i in 0..10) {
            println("Task 1 ${i*10} %")
            Thread.sleep(1000)
        }
    }
}