package types.basicTypes

fun main(args: Array<String>) {

    //  Kotlin provides the following types for unsigned integer numbers:
    //      UByte: an unsigned 8-bit integer, ranges from 0 to 255
    //      UShort: an unsigned 16-bit integer, ranges from 0 to 65535
    //      UInt: an unsigned 32-bit integer, ranges from 0 to 2^32 - 1
    //      ULong: an unsigned 64-bit integer, ranges from 0 to 2^64 - 1

    //      UNSIGNED ARRAYS AND RANGES
    //          UByteArray: an array of unsigned bytes
    //          UShortArray: an array of unsigned shorts
    //          UIntArray: an array of unsigned ints
    //          ULongArray: an array of unsigned longs

    //      UNSIGNED INTEGERS LITERALS
    val b: UByte = 1u  // UByte, expected type provided
    val s: UShort = 1u // UShort, expected type provided
    val l: ULong = 1u  // ULong, expected type provided

    val a1 = 42u // UInt: no expected type provided, constant fits in UInt
    val a2 = 0xFFFF_FFFF_FFFFu // ULong: no expected type provided, constant doesn't fit in UInt

    //          uL and UL explicitly tag literal as unsigned long:
    val a = 1UL // ULong, even though no expected type provided and constant fits into UInt
}