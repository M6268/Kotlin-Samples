package day2

fun main(args:Array<String>)
{
    print("\t\tMENU\n")
    println("1. shirt     -300")
    println("2. pants     -300")
    println("3. saree     -320")
    println("4. dhothi    -400")
    println("5. churidhar -550")

    print("\nEnter your Choice: ")
    val item:Int= readLine()?.toIntOrNull()?:0

    print("\nEnter the Quantity:")
    val q:Int = readLine()?.toIntOrNull()?:0

    when(item)
    {
        1,2 ->{
            if(item==1)
                println("$q * shirt , total=${q*300}")
            else
                println("$q * pants , total=${q*300}")
        }
        3 ->{
            println("$q * saree , total=${q*320}")
        }
        4->{
            println("$q * dhdothi , total=${q*400}")
        }
        5 ->{
            println("$q * churidhar , total=${q*550}")
        }
        else ->{
            println("Invalid Choice")
        }

    }
}