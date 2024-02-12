/** This file it's to show how constructors are handled in Kotlin (the parameters, and override of
 * toString() method.
 *
 * @author pedro de castro tedesco
 * @since 11/02/2024
 * @see "Atomic Kotlin"
 * */

package org.conductor.objectsInKotlin.constructorsBasicsImmutableAndMutableObj

class Wombat
{
};//end of Wombat class

/** Note that we pass the list parameters of the class constructor in the header of the class.
 * This parameter is used to initialize the value of the greeting property. This parameter is not
 * accessible outside the constructor.
 * */
class Alien(name: String)
{
    val greeting = "Hi $name";
};//end of Alien class

/** If we want that the parameter of the constructor be accessible outside the constructor class
 * then we have to declare it with 'var'; and if we do not that we declare it as 'val'. When we do this
 * the parameter becomes a property and is thus accessible outside the constructor.
 * The 'val' parameter in the constructor cannot be changed, while 'var' parameters are mutable.
 * */

class AlienSpecies(
    val name: String,
    val eyes: Int,
    val hands: Int,
    val legs: Int)
{
    //Member functions
    fun describe(): String =
        //the return is implied. We used the expression function format
        "$name with $eyes," + "$hands hands and $legs legs";

};//end of AlienSpecies class

class MutableAlienName(var name:String); //we can declare the class like this (the bodies are implied).
class FixedAlienName(val name:String);

class Scientist(val name: String)
{
    //Override the toString() default method
    override fun toString(): String
    {
        return "Scientist('$name')"
    };//end of toString()
};//end of Scientist class

fun main()
{
    //We can initialize an object just calling its constructor. We do not need to use the 'new' keyword.
    val wombat = Wombat();

    val alien = Alien("Mr. Poopchok");
    println(alien.greeting);
    //If we try alien.name (calling the parameter outside the constructor) it throws an error.

    val alien1 = MutableAlienName("Reverse Giraffe");
    val alien2 = FixedAlienName("Michael Jordan");

    alien1.name = "parasite";
    //Can't do this: alien2.name = "parasite" --throws an error

    //Immutable parameters
    val kevin = AlienSpecies("Zigerion", 2, 2, 2);
    val mortyJr = AlienSpecies("Gazorpian", 2, 6, 2);
    println(kevin.describe());
    println(mortyJr.describe());

    //When we call the variable that holds the reference of the object we call toString()
    val kromboulosMichael = AlienSpecies("Gromflorite", 2, 3, 5);
    println(kromboulosMichael);

    val zeep = Scientist("ZeepMan");
    println(zeep);
};//end of main()