package day2

fun main(args:Array<String>)
{
    println("""
        1.without without
        2.without with
        3.with without
        4.with with
        """)
    print("\nEnter Choice:")
    val choice= readLine()?.toIntOrNull()?:0
    when(choice)
    {
        1 ->{
            add()
        }
        2 ->{
            val sum=add1()
            println("Sum =$sum")
        }
        3 ->{
            add2(2,4)
        }
        4 ->{
            val sum=add3(5,6)
            println("sum of 5 and 6 is $sum")
        }
        else ->{
            println("Invali Choice Made!")
        }
    }
}

//function wihtout args without return
fun add()
{
    val a=1
    val b=2
    val c=a+b
    println("sum of $a an $b is $c")
}

//function wihtout args with return
fun add1():Int
{
    val a=1
    val b=2
    val c=a+b
    return  c
}

//function with args ans without return
fun add2(a:Int,b:Int)
{
    val c=a+b
    println("sum of $a and $b is $c")
}

//function withd args and with return

fun add3(a:Int,b:Int):Int{

    val c=a+b
    return  c
}

//odd or even
