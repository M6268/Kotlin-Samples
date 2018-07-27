package day2

import com.sun.xml.internal.fastinfoset.util.StringArray

fun main(args:Array<String>)
{
    print("Enter Array Size: ")
    val size= readLine()?.toIntOrNull()?:0
    val array= IntArray(size)

    var sum=0

    for(i in 0..array.lastIndex)
    {
        print("Enter ${i+1} th No: ")
        array[i]= readLine()?.toIntOrNull()?:0
        if(array[i]%2==0)
            sum+=array[i]
    }

    println("Sum Of Even Numbers In Array ${array.toList()}=$sum")
}