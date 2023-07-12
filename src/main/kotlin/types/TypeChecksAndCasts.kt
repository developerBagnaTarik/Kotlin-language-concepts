package types

fun main(args: Array<String>) {
    // TYPE CHECKS AND CASTS

    //      is and !is operator
    //      They are used like this
    val obj = ""
    if(obj is String){
        print(obj.length)
    }
    //      Or this
    if(obj !is String){
        print("Is not a string")
    }else{
        print(obj.length)
    }
    //  SMART CAST
    //      automatically cast a variable to a type to perform some actions
    //      Eg
    val x:Any = 1
    if(x !is String) return
    print(x.length)
    //      SMART CAST also works for when and while loops
    //  UNSAFE CAST
    //      It is performed with the as keyword
    val y:String? = x as String?
    //  SAFE CAST
    //      Performed with the as? keyword -> the result can be null
    val z:String? = x as? String
}