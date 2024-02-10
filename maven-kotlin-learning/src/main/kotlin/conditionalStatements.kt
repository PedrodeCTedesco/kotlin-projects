/** Here are some examples of conditional statements on Kotlin.
 * @since 10/02/2024
 * */

fun main()
{
    println("<-- using an if expression -->");

    if (1 > 0)
        println("true")

    if (3 == 3)
        println("3 is equal to 3");

    //We can create boolean expressions that evaluates to true or false
    val booleanExpression: Boolean = 4 >= 2;
    if (booleanExpression)
        println("Hey there!")

    println("<-- using if.. else statements -->")

    if (5 > 9)
        println("5 > 9 its true")
    else
        println("5 > 9 is false")

    println("<-- using if... else if... else statements -->")

    val nome = "Pedro";
    if (nome == "João")
        println("O nome é João");
    else if (nome == "Pati")
        println("O nome é Pati");
    else if (nome == "Pedro")
        println("O nome é Pedro");
    else
        println("Não há nomes válidos");

    println("<-- using the if in an expression -->")

    val result = if (5 > 5) 10 else 9;
    val result2 = if (4 == 4) println("O valor é 4") else println("O");

    println(result);
    println(result2);

    println("<-- other examples -->");

    fun trueOfFalse(exp: Boolean): Boolean
    {
        if (exp)
            return true;
        return false;
    };//end of trueOrFalse(exp: Boolean): Boolean

    fun trueOrFalse2(exp: Boolean): String {
        return if(exp)
            "true";
        else
            "false";
    };
};//end of main()
