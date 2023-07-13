package controlFlow

import java.lang.NumberFormatException

fun main(args: Array<String>) {
    //  EXCEPTION CLASSES
    //      throw Exception("Hi there!")

    try {
        val a = 5/0
    }catch (e:ArithmeticException){
        println(e.message)
    }finally {
        println("done")
    }

    //  TRY AS EXCEPTION
    val input = ""
    val a: Int? = try{ input.toInt()} catch (e:NumberFormatException){ null }

    //  CHECKED EXCEPTIONS
    //      Kotlin does not have checked exceptions

    //  NOTHING TYPE
    //      Every throw exception has the type Nothing
}