/** This is a immutable object because its properties are declared as val.
 * Remember that 'var' and 'val' control references of objects and not objets in itself
 * @author pedro de castro tedesco
 * @see "Atomic Kotlin"
 * @since 11/02/2024
 * */

package org.conductor.objectsInKotlin.constructorsBasicsImmutableAndMutableObj

class Sofa
{
    val cover: String = "Loveseat cover";
};//end of Sofa class;

fun main()
{
    //Even though 'sofa' is a var, it's object contains a property that is a val. So, it can't be reassigned.
    //But its reference can be reassigned to another variable.
    var sofa = Sofa();
    //sofa.cover = "Oi";
    //println(sofa);
    sofa = Sofa();
    println(sofa);

}