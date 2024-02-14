/** This file is for demonstrating the varargs keyword to introduce flexible number of parameters.
 * In Kotlin, an Array is a data type used for compatibility with other languages; note that in Kotlin,
 * an Array as low-level support. Because of that, its preferred to use a List because it's a regular
 * library in Kotlin.
 * An array is Kotlin is always mutable and we can create one using arrayOf() just like the listOf() method.
 *
 * (mutable or immutable)
 * @author pedro de castro tedesco
 * @since 13/02/2024
 * @see "Atomic Kotlin"
 * */

package org.conductor.collections

/** A function definition may specify only one parameter as varargs. Although it's possible
 * to specify any item in the parameter list as varargs, it's usually simplest to do it
 * for the last one.
 *
 * Varargs allows you to pass any number (including zero) of arguments. All arguments must be
 * of the specified type. Varargs arguments are accessed using the parameter name, which becomes
 * an Array.
 * */

fun varargsExample (name: String, vararg numberOfCats: Int){};
fun sumOfNumbers (vararg numbers: Int): Int
{
    var total: Int = 0;
    for (n in numbers)
        total += n;
    return total;
};//end of sum();

var test = sumOfNumbers(1, 2, 3);

/** To convert an Array into a sequence of arguments (not just a single element of type Array)
 * use the spread operator. This operator only works with arrays. Another thing: when we pass
 * some primitive types like (integer, boolean, double) we must specify the type of the array
 * and that's why we use 'intArrayOf(4, 5)'.
 *
 * In the List example, we must first convert the List to an array to use the spread operator.
 *
 * */
val array = intArrayOf(4, 5);
val totalArraySum = sumOfNumbers(1, 2, *array);

val list: List<Int> = listOf(9, 10, 11);
val totalSum = sumOfNumbers(*list.toIntArray());


fun main()
{
    varargsExample("Gatinhos", 1);
    varargsExample("Gatinhos", 1, 2);
    varargsExample("Gatinhos", 1, 2, 3);
};//end of main()

/** The spread operator is useful when we must pass an vararg arguments to an function
 * that receives varargs.
 *
 * fun first (varargs numbers: Int): String
 * {
 *  var result = "";
 *  for (n in numbers)
 *      result += "[$n]";
 *  return result;
 * }
 *
 * fun second (varargs numbers): Int) = first(*numbers);
 *
 * fun main() = second(12, 4, 8);
 * */