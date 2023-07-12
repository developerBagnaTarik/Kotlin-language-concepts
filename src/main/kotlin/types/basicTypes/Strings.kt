package types.basicTypes

fun main(args: Array<String>) {

    //  STRINGS
    //  in Kotlin are represented by the type String
    //  Generally, a string value is a sequence of characters in double quotes ("):
    val str = "a 123"

    //  Elements of string are characters that we can access via the indexing operation
    //  s[i] where s is the string

    for(c in str){
        println(c)
    }

    //  Strings are immutable.
    //  It means that you can't change the value after the initialization
    println(str.uppercase())
    println(str)

    //  We can concatenate Strings
    val s = "a"+1
    // the expression below is possible only if the first part of the + operator is a string
    println(s)
    println(s+"def")

    //  STRING LITERALS
    //      Kotlin has two types of string literals:
    //          Escaped strings
    //          Raw strings
    //      ESCAPED STRINGS
    //          contains escaped characters
    val aString = "Hello, world!\n"
    //      RAW STRINGS
    //          contain newlines and arbitrary text.
    //          It is delimited by a triple quote ("""),contains no escaping
    //          And can contain newlines and any other characters:
    val text = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin("|")
    print(text)
    //  STRINGS TEMPLATES
    // the keyword $ or ${}
    val i = 10
    println("i = $i")
    val string = "abc"
    println("$string.length is ${string.length}")
}