/** This file is for basics of objects in Kotlin. Some definitions:
 * Class -> defines properties and functions for what is essentially a new data type.
 * Classes are also called user-defined types. Classes define states and behavior.
 *
 * Member -> either a properties or a function of a class
 *
 * Member function -> a function that works only with a specific class of object.
 *
 * Creating an object -> making a val or a var of a class. Also called creating
 * an instance of that class.
 *
 * @since 10/02/2024
 * */

package org.conductor.objectsInKotlin.constructorsBasicsImmutableAndMutableObj

fun main()
{
    println("Example: instances of IntRange class");

    val r1 = IntRange(0, 10);
    val r2 = IntRange(5, 7);
    println(r1);
    println(r2);

    // Calling a member function of IntRange class
    println(r2.sum());

    println("Example: instance of String class");

    val s = "pedro";
    val a = "125523";
    println(s.reversed());
    println(s.uppercase());
    println(a.toInt());

    val i = 14;
    println(i.toString());

    // We can also convert from one numerical type to another, but the conversion
    //must be explicit.

    fun fraction(numerator: Long, denominator: Long) = numerator.toDouble() / denominator;

    val num = 1;
    val dem = 2;
    val f = fraction(num.toLong(), dem.toLong());
    println(f);
};//end of main();