package controlFlow

fun main(args: Array<String>) {

    //  RETURNS AND JUMPS
    //  BREAK AND CONTINUE LABELS
    loop@ for (i in 1..5){
        for (j in 1..5){
            if(j==i) break@loop
        }
    }

    //      The block of code below means that when "j == i" breaks me the first loop
    //      If we wrote "if(j==i) break" instead of "if(j==i) break@loop" only the second loop will be broke

    //  RETURN TO LABELS
    fun foo() {
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return // non-local return directly to the caller of foo()
            println(it)
        }
        println("this point is unreachable")
    }
    fun foo2() {
        listOf(1, 2, 3, 4, 5).forEach lit@{
            if (it == 3) return@lit // local return to the caller of the lambda - the forEach loop
            println(it)
        }
        println(" done with explicit label")
    }
    fun foo3() {
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return@forEach // local return to the caller of the lambda - the forEach loop
            println(it)
        }
        println(" done with implicit label")
    }
    foo()
    foo2()
    foo3()
}