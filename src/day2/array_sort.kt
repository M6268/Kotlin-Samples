package day2

fun main(args:Array<String>) {

    print("Enter Array Size: ")
    val size= readLine()?.toIntOrNull()?:0
    val numbers=IntArray(size)

    for(i in 0..numbers.lastIndex)
    {
        print("Enter ${i+1} th No: ")
        numbers[i]= readLine()?.toIntOrNull()?:0
    }

    println("Input Array = ${numbers.toList()}")


    var tmp:Int
    for(i in 0..numbers.lastIndex)
    {
        for(j in i+1..numbers.lastIndex)
        {
            if(numbers[i]>numbers[j]) {
                tmp = numbers[i]
                numbers[i] =numbers[j]
                numbers[j]=tmp

            }
        }
    }


    println("Sorted Array= ${numbers.toList()}")

}

