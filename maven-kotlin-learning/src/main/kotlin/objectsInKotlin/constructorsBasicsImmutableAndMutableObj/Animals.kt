/** This is an example of a class in Kotlin.
 * @author pedro de castro tedesco
 * @since 10/02/2024
 * @see "Atomic Kotlin"
 * */

package org.conductor.objectsInKotlin.constructorsBasicsImmutableAndMutableObj

//We just use a keyword class followed by te identifier
class Giraffe;
class Bear;
class Hippo;

class Dog
{
    //Member function (the 'methods' in Java);
    fun bark() = "au";
};//end of Dog class

//About the keyword 'this'
class Hamster
{
    //Member functions
    fun speak() = "Squeak!";
    // We can use 'this' to explicitly tied an object, or just use it implicitly.
    fun exercise() = this.speak() + speak() + "Running on wheel";
}

fun main()
{
    //To instantiate an object we call the constructor of the class. These are simple classes
    val g1 = Giraffe();
    val b1 = Bear();
    val h1 = Hippo();

    // Each object is unique. When we print it and get something like:
    // org.conductor.objectsInKotlin.Giraffe@b4c966a that is the name of the package, then
    // the class and after @ the address in memory for that object.
    println(g1);
    println(b1);
    println(h1);

    val dog = Dog();
    println(dog.bark());

    val hamster = Hamster();
    println(hamster.exercise());

    /** Remember that var and val control references rather than objects. A var allows you to rebind
     * a reference and a val prevents you from doing so.
     *
     * The term 'mutability' means that an object can change its state. In the examples, class House
     * and class Kitchen are mutable, and class Sofa (with a val property) is immutable.
     * */
};//end of main();