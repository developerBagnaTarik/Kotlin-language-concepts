package controlFlow

import java.util.Random

fun main(args: Array<String>) {
    //  CONDITIONS AND LOOPS

    //  IF EXPRESSION
    //      In kotlin, there is no ternary operator because "if" can do it
    //          var max = an
    //          if(an<b) max=b
    //          if(an<b){ max = an }else{ max = b }
    //          val max = if(an>b) an else b -> equal to ternary operator in other language
    //          val maxOrLimit = if (maxLimit > an) maxLimit else if (an > b) an else b

    //  WHEN EXPRESSION
    var x = (1..10).random()
    when(x){
        1-> println("x==1")
        2-> println("x==2")
        else -> println("x is neither 1 nor 2")
    }
    //      The "else" of when keyword is not required if when has a subject of a Boolean,enum or sealed
    //      We can define a common behavior for multiple cases
    when(x){
        0,1 -> println("x == 0 or x == 1")
        else -> println("otherwise")
    }
    fun hasPrefix(x:Any) = when(x){
        is String -> x.startsWith("prefix")
        else->false
    }
    println(hasPrefix("prefix"))

    //  FOR LOOPS
    //      for (item in collection) println(item)
    for(i in 1..3){
        println(i)
    }
    for(i in 6 downTo 0 step 2){
        println(i)
    }

    //  WHILE LOOPS
    while (x>0){
        x--
    }

    do {
        val y = "something"
    }while (x != null)

    //  We can use break and continue like in java
}