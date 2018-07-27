package day1

fun main(args:Array<String>)
{
    print("\t\tMENU\n")
    println("1. Perotta    -10")
    println("2. Beef Fry   -90")
    println("3. Biriyani   -100")
    println("4. Meals      -40")
    println("5. Chappathi  -8")

    print("\nEnter your Choice: ")
    val item:Int= readLine()?.toIntOrNull()?:0
    if(item>0&&item<=5)
    {
        print("\nEnter the Quantity:")
        val q:Int= readLine()?.toIntOrNull()?:0;
        var total:Int =0
        var name:String
        if(q>0)
        {
            if(item==1)
            {
                total=10*q;
                name="Perotta"
            }
            else if(item==2)
            {
                total=90*q;
                name="Beef Fry"
            }
            else if(item==3)
            {
                total=100*q
                name="Biriyani"
            }
            else if(item==4)
            {
                total=40*q
                name="Meals"
            }
            else
            {
                total=8*q
                name="Chappathi"
            }
            println("$q * $name = Rs $total")
        }
        else
        {
            println("No Quantity")
        }
    }
    else
        println("No Item Selected")
}