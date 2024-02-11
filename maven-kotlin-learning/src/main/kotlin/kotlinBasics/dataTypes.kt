package kotlinBasics

/** This is for the data types on Kotlin
 * @since 10/02/2024
 * */

fun main(): Unit
{
    // Kotlin allow underscore for int type for readability
    val million: Int = 1_000_000;
    println(million);

    println("For integer division the compiler truncates the result");
    val numerator: Int = 19;
    val denominator: Int = 10;
    println(numerator / denominator);

    println("For modulus as well")
    println(numerator % denominator);

    // If we want to use double numbers, then we have to specify the type of the variable

    fun bmiMetric(weight: Double, height: Double): String
    {
        val bmi = weight / (height * height);
        return if (bmi < 18.5) "Underweight";
                else if (bmi < 25) "Normal weight";
                else "Overweight";
    };//end of bmiMetric(weight:Double, height: Double):String
    val status: String = bmiMetric(101.6, 1.85);
    println("The BMI is: $status");

    /** We can use: Long, Double, Integer, Boolean, String, Char
     * */

    println("Booleanos")
    //We have && (AND) ! (NOT), || (OR)

    fun isOpen(hour: Int): Unit
    {
        val open = 9;
        val closed = 20;
        println("Operation hours: $open - $closed");
        val status = (hour >= open && hour <= closed);
        println("Open: $status");
    };//end of isOpen(hour:Int):Boolean

    println(isOpen(12));


};//end of main(): Unit