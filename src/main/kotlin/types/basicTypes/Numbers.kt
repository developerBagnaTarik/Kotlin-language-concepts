package types.basicTypes

import java.util.Objects
import kotlin.reflect.typeOf

fun main(args: Array<String>) {
    //  One of Basic type in Kotlin is Numbers

    //  And we have many types of Numbers

    //  INTEGER TYPES:
    //      Byte : min value is -128 and max is 127
    //      Short : min value is -32768 and max is 32767
    //      Int : min value is -2,147,483,648 (-2^31) and max is 2,147,483,647 ((2^31) - 1)
    //      Long : min value is -9,223,372,036,854,775,808 (-2^63) and max is 9,223,372,036,854,775,807 ((2^63) - 1)
    val one = 1 // -> The type is Int
    val threeBillion = 3000000000 // -> Type is Long
    val oneLong = 1L // -> Type is Long
    val oneByte:Byte = 1

    //  FLOATING-POINT type:
    //      Float: size = 32 bits
    //      Double: size = 64 bits

    val pi = 3.14 // -> is a Double
    val oneDouble = 1.00 // -> is a Double

    //  To explicit float we can write f or F at the end of the value

    val e = 2.718281 // -> is a Double
    val eAsFloat  = 2.718281F //-> is a Float

    //  No implicit conversion between numbers
    //  To convert them we can use explicit conversions

    //  LITERAL CONSTANTS FOR NUMBERS
    //      We have literal constants such as
    //          Decimal: 123
    //          Long: 123L
    //          Hexadecimals: 0x0F
    //          Binaries: 0b00001011
    //          Doubles: 123.5 or 123.5e10
    //          Floats: 123.5f or 123.5F
    //      We can use underscores to make numbers constants more readable
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L

    //  REPRESENTATION OF NUMBERS ON THE JVM
    //      In the JVM Platform numbers are stored as primitive types : int,double and so on
    //      But for some types like Int? and generics types, numbers are boxed in Integer,Double and so on
    val a: Int = 100
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    val b: Int = 10000
    val boxedB: Int? = b
    val anotherBoxedB: Int? = b

    println(boxedA === anotherBoxedA) // true
    println(boxedB === anotherBoxedB) // false
    //  println(boxedA === anotherBoxedA) is false because of the memory optimization that JVM applies to Integer's
    //  between -128 and 127
    //  It doesn't apply to println(boxedB === anotherBoxedB) because b is bigger than 127

    //  EXPLICIT NUMBER CONVERSIONS
    //      Due to different representations, smaller types are not subtypes of bigger ones
    //      Hypothetical code, does not actually compile:
    //      val a: Int? = 1 // A boxed Int (java.lang.Integer)
    //      val b: Long? = a // Implicit conversion yields a boxed Long (java.lang.Long)
    //      print(b == a) -> false
    //      We can do like this
    val aNumber:Int = 1
    val aNumberLong:Long = aNumber.toLong()

    //  OPERATIONS ON NUMBERS
    //      Kotlin supports the standard set of arithmetical operations over numbers: +, -, *, /, %.
    //      val x = 5/2 -> type is int
    //      val x = 5L/2 -> type is long
    //      val x = 5 / 2.toDouble() -> type is double
    //      We have bitwise operations such as shl(bits),and(bits) so on
    //      We have floating-point numbers comparison such as a == b | a != b | a < b | a..b | x in a..b
    //      NaN is considered equal to itself
    //      NaN is considered greater than any other element including POSITIVE_INFINITY
    //      -0.0 is considered less than 0.0
}