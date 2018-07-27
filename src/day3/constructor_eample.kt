package day3

import javafx.scene.text.FontWeight

fun main(args:Array<String>)
{
    val dell=Laptop(75)
    val hp=Laptop("hp",80)
    val acer=Laptop("Acer",90,"white",2)

    dell.use()
    dell.use()
    dell.display()

    hp.use()
    hp.display()

    acer.use()
    acer.display()
}

class Laptop(var power:Int){
    var name:String=""
    var color:String=""
    var weight:Int=0
    init {
        println("Lap1")
    }

    constructor(name:String,power:Int) : this(power) {
        this.name=name
    }

    constructor(name:String,power: Int,color:String,weight:Int):this(name,power)
    {
        this.weight=weight
        this.color=color
    }

    fun use()
    {
        power--
    }

    fun display()
    {
        println("""
            Name  : $name
            Power : $power
            Weight: $weight
            Color : $color
            """)
    }

}