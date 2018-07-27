package day1

fun main(args:Array<String>)
{
    print("\nEnter a number: ")
    val a:Int= readLine()?.toIntOrNull()?:0

    print("$a is ")
    if(a > 0)
        print("Positve")
    else
        print("Negative")

}