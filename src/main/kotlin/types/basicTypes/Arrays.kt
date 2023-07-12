package types.basicTypes

fun main(args: Array<String>) {
    //  ARRAYS
    //      To create an Array we can use the function arrayOf()
    val array = arrayOf(1,2,3)
    array.forEach {
        println(it)
    }
    //      We can also use the array constructor
    val asc = Array(5){i-> (i*i).toString()} // -> it creates : ["0","1","4","9","16"]
    asc.forEach { println(it) }

    //      [] operation stands for calls to member functions get() and set()
    //      I mean
    //          [] -> stand for get()
    val getOneAscValue = asc[0]
    //          [] -> stand for set()
    asc[1] = "5"

    //  PRIMITIVE TYPE ARRAYS
    //      We have
    val x:IntArray = intArrayOf(1,2,3)
    val y:ByteArray = byteArrayOf(1,2)
    val z:ShortArray = shortArrayOf(1,2)
    //      and so on...
}