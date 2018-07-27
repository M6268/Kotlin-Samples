package day1

fun main(args: Array<String>)
{
    var a:Int =5
    var b:Int =2

    println("Initially a=$a && b=$b")

    var tmp:Int =a;
    a=b;
    b=tmp;

    a=5
    b=2

    a=a+b
    b=a-b
    a=a-b

    println("Now a=$a && b=$b")


}