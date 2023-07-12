package types.basicTypes

fun main(args: Array<String>) {

    //  Type Boolean represents boolean objects that can have two values: true and false
    //  This type has a nullable counterpart Boolean? that also hase the null value
    // || -> logical OR
    // && -> logical AND
    // ! -> logical NOT
    val myTrue: Boolean = true
    val myFalse: Boolean = false
    val boolNull: Boolean? = null

    println(myTrue || myFalse)
    println(myTrue && myFalse)
    println(!myTrue)
}