package kotlinBasics

/** This file is for discussion about the 'in' keyword.
 * The 'in' tests whether a value is within a range. When checks for membership it returns a boolean value.
 * @since 10/02/2024
 * */

fun main()
{
    val percent: Int = 6;
    println(percent in 0..100); //return a boolean value: true

    //We can use the keyword as equivalent to a boolean expression
    println(0 <= percent && percent <= 100);

    // The keyword is used for membership and iteration.

    println("The 'in' keyword inside a for loop checks for iteration");

    val values: IntProgression = 1..3;
    for (v in values)
    {
        println("iteration $v");
    };//end of enhanced for

    println("The 'in' keyword outside a for loop checks for membership");

    val v = 2;
    if (v in values)
        println("$v is a member of values");

    // We can check if a character belongs to a String

    println('f' in "griffon");
    println('a' in "kotlin");

    // Other uses
    fun isDigit(ch: Char): Boolean = ch in '0'..'9';

    fun notDigit(ch: Char): Boolean = ch !in '0'..'9'; // check if the value doesn't belong to a range

    println(isDigit('a'));
    println(isDigit('5'));
    println(notDigit('z'));

    println("We can create a Double range, but you can only use it to check for membership");

    fun inFloatRange(n: Double): Unit
    {
        val r = 1.0..10.0;
        println("$n in $r? ${n in r}")
    };//end of inFloatRange(n: Double): Unit

    inFloatRange(0.999999);
    inFloatRange(5.0);
    inFloatRange(10.0);
    inFloatRange(10.0000001);

    println("We can check if a String belongs to a range of Strings");

    println("ab" in "aa".."zz");
    println("ba" in "aa".."az");
};//end of main()