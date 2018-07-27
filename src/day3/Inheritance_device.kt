package day3

open class Device
{
    open var name="Name"
    open var power=100
    open var weight=0

    open fun turnOn()
    {
        println("$name is turning on")
    }
}

class Laptops(override var weight:Int):Device()
{
    override var power:Int=0
    constructor(weight:Int,power:Int):this(weight)
    {
        this.power=power
    }
    override var name="Laptop"

    override fun turnOn()
    {
        super.turnOn()
        println("$name is turning on")
        println("with a power: $power")
    }
}

class Mobile
{

}

fun main(args: Array<String>) {
    val hp=Laptops(2,58)
    hp.turnOn()

}