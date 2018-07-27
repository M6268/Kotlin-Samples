package day2

fun main(args:Array<String>)
{
    val a=-90
    val b=-20
    val c=-30

    if(a>b)
    {
        if(a>c)
        {
            println("Large is $a")
        }
        else
            println("large is $c")
    }
    else if(b>c)
    {
        println("large is $b")
    }
    else
        println("large is $c")

}