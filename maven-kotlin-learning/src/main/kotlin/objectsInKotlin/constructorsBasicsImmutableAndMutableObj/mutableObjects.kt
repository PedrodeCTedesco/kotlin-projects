/** This is a mutable object because its properties are declared as var.
 * Remember that 'var' and 'val' control references of objects and not objets in itself
 * @author pedro de castro tedesco
 * @since 11/02/2024
 * @see "Atomic Kotlin"
 * */

package org.conductor.objectsInKotlin.constructorsBasicsImmutableAndMutableObj;

class Kitchen
{
    //Properties
    var table: String = "Round table";
};//end of Kitchen class

class House
{
    //Properties
    var sofa: String = "";
};//end of House class

fun main()
{
    //Although house is a val, we can reassign the value of its 'sofa' property because it's a var.
    val house = House();
    house.sofa = "Simple sleeper sofa: $89.00";
    println(house.sofa);
    house.sofa = "New leather sofa: $3,099.00";
    println(house.sofa);

    /** Note that sofa, house etc. are references to objects (just like in Java).
     * So, it is possible to store references between objects.
     * */
    //This behavior is similar to object pointers in JS. When we change a state of the object
    //the other references change as well.
    val kitchen1 = Kitchen();
    val kitchen2 = kitchen1;
    println("kitchen1: ${kitchen1.table}");
    println("kitchen2: ${kitchen2.table}");
    kitchen1.table = "Square table";
    println("kitchen1: ${kitchen1.table}");
    println("kithen2: ${kitchen2.table}");

}