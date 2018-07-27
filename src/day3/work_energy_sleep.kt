package day3

fun main(args:Array<String>) {
    val me=Person(100)
    val u=Person()
    println("Current energy level: ${me.getEnergyLevel()}")

    me.work()
    me.work()

    println("My Energy level after 2 works :${me.getEnergyLevel()}")

    println("I need some energy, i need to sleep")
    me.sleep()
me.haveACoffee()
    println("My energy boosted to :${me.getEnergyLevel()} after 1 sleep")
}



class Person(var energy:Int=100) {

    fun work() {
        energy--
    }

    fun sleep() {
        energy+=5
    }

    fun haveACoffee()
    {
        energy+=10
    }

    fun getEnergyLevel():Int
    {
        return  energy
    }
}