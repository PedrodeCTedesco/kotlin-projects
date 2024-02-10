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

};//end of main()