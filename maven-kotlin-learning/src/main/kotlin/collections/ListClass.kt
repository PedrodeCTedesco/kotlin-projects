/** This file is used to an introduction to List, a collection in Kotlin. The List
 * is part of the standard lib of Kotlin, so it does not require an import statement.
 * @author pedro de castro tedesco
 * @since 13/02/2024
 * @see "Atomic Kotlin"
 * */

package org.conductor.collections

//top-level properties of the file
val listOfInts: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

/** The listOf() produces an immutable List. If we want a mutable List of elements (that means that our
 * List does not have a fixed size in compilation time) we should use 'mutableListOf()' method.
 * We can use the following syntax:
 *
 * val mutableList: List<Int> = mutableListOf<Int>();
 * mutableList.add(1); --that's one way
 * mutableList.addAll(listOf(1, 2, 3));
 * mutableList+=4;
 * mutableList+=listOf(5, 6, 7);
 * */

val mutableListOfInts: List<Int> = mutableListOf(1, 2);

/** A List can contain multiple elements of different data types.
 * */

val listOfDoubles: List<Double> = listOf(2.3, 1.1, 5.67);
val listOfStrings: List<String> = listOf("Vênus", "Lua", "Nuvem");

//Using some methods of Collection lib
val listOfIntReversed: List<Int> = listOfInts.reversed();

/** We can treat a mutable list as a read-only List (we cannot change their elements after instantiation).
 * We can't, however, treat a read-only List as a MutableList. Because of aliasing we have to take care
 * in the amount of references that our program produces.
 * */

fun main()
{
    val firstList = mutableListOf(1, 2);
    val secondList: List<Int> = firstList;
    println(secondList);
    firstList.addFirst(3);
    println(secondList);
};//end of main();