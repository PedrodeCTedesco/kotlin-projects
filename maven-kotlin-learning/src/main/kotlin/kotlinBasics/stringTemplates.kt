package kotlinBasics

/** Just to show the string templates.
 * Definition: A string template is a programmatic wat to generate a String.
 * @since 10/02/2024
 * */

fun main()
{
    val answer: Int = 42;
    println("The answer is $answer");

    // The print() method aloud us to concatenate String and other data types
    //because they are converted implicitly to a String

    val a: Int = 45;
    val b: Double = 4.1;
    val c: String = "Duda"
    println("Amanhã eu vi a $c" + a + "e depois " + b);

    //If we use ${} the expression inside the curly braces is evaluated and returned

    val n = 10;
    val m = 120;
    println("There we ${n + m} case of that today");

    val condition: Boolean = 7 > 2;

    println("Então é ${if (condition) "verdade" else "mentira"}");

    // When a String must include a special character, such as a quote, you can either escape that character
    //with a backslash \ or use Stirng literal in triple quotes """."""

};//end of main()