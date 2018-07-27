package day3.thread

class Task1 : Thread() {
    override fun run() {
        super.run()
        for (i in 0..10) {
            println("Task 2 ${i*10} %")
            Thread.sleep(1000)
        }
    }
}