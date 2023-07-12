package types.basicTypes

fun main(args: Array<String>) {

    //Characters are represented by the type Char. Character literals go in single quotes: '1'.

    //Special characters start from an escaping backslash \. The following escape sequences are supported:

    //    \t – tab
    //    \b – backspace
    //    \n – new line (LF)
    //    \r – carriage return (CR)
    //    \' – single quotation mark
    //    \" – double quotation mark
    //    \\ – backslash
    //    \$ – dollar sign

    val aChar: Char = 'a'

    println(aChar)
    println('\uFF05')
}