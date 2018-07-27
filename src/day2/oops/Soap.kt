package day2.oops

class Soap {
    var thickness=100


    fun shower()
    {
        thickness--
    }
}


fun  main(args:Array<String>)
{
    val pears=Soap()
    val nano =Soap()

    pears.shower()
    pears.shower()

    nano.shower()

    println("Pears's Remaining Thickness: ${pears.thickness}")

    println("Nano's Remaining Thickness: ${nano.thickness}")
}