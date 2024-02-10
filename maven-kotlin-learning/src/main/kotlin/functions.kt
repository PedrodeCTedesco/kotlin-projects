fun main()
{

    /** We can declare a function using the 'fun' keyword and the following sintax:
     * <keyword> <identifier> (<parameter>: Type...): <return type>
     *     {
     *              //function body
     *          <keyword> <return>
     *      }
     *
     * Such as:
     *
     * fun example: Int (x: Int, y: Int): Int
     * {
     *      return x * y
     *  }
     *
     * */

    fun multiplyByTwo(x: Int): Int
    {
        return x * 2;
    };//end of multiplyByTwo;

    var result: Int = multiplyByTwo(2);
    println(result);

    //If we haven't specified the return value of the function, then the compiler assumes that is Unit
    fun greetings(): Unit
    {
        println("Olá!");
    };//end of greetings();

    greetings();

    /** If the function is a single expression than we can use the abbreviated sintax of
     * an equals sign followed by the expression.
     * fun example(x: Int): Int = x * 3
     *
     * The 'return' keyword its used implicitly.
     * */
    println("**** Using the abbreviated form of a function ****");

    fun functionName(name: String): String = "meu nome é ${name}";
    fun multiplyByThree(x: Int): Int = x * 3;
    println(functionName("Pedro"));
    println("3 multiply by 3 is: " + multiplyByThree(3));

    //Note the Kotlin can infer the type of the return only on expression bodies of functions.
    // If we don't set the return type for a block function body then the compiler will assume that is Unit.
    
};//end of main()