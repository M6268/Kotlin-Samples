package day2

fun main(args:Array<String>)
{
    print("Enter the Multiplier:")
    val multiplier= readLine()?.toIntOrNull()?:0
    print("\nEnter the Range:")
    val range= readLine()?.toIntOrNull()?:0
    for(i in 1..range)
    {
        println("$i * $multiplier= ${i*multiplier}")
    }


}