package day2

import kotlin.math.ln

fun main(args:Array<String>)
{
    println("""
        1.without without
        2.without with
        3.with without
        4.with with
        """)
    print("\nEnter Your Choice:")
    val choice= readLine()?.toIntOrNull()?:0
    when(choice)
    {
        1->{
            isEven()
        }
        2->{
            val even=isEven1()
            if(even)
                println("Even")
            else
                println("Odd")
        }
        3->{
            isEven2(5)
        }
        4->{
            val even=isEven3(5)
            if(even)
                println("Even")
            else
                println("Odd")
        }
        else->
        {
            println("Invalid Choice!")
        }
    }
}
fun isEven()
{
    val a=7
    if(a%2==0)
        println("Even")
    else
        println("Odd")
}

fun isEven1():Boolean
{
    val num=4
    if(num%2==0)
        return true
    else
        return false
}

fun isEven2(num:Int){
    if(num%2==0)
        println("Even")
    else
        println("Odd")
}

fun isEven3(num:Int):Boolean{
    if(num%2==0)
        return true
    else
        return  false
}