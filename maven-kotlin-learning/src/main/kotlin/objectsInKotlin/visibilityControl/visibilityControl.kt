/** This file is to show the visibility constrains that we can use on classes and objects.
 * The basic stuff seems very similar to Java.
 * @author pedro de castro tedesco
 * @since 12/02/2024
 * @see "Atomic Kotlin"
 * */

package org.conductor.objectsInKotlin.visibilityControl

/** If no access modifier is provided the default value is 'public' meaning that the class, top-level property
 * or top-level function are accessible anywhere in the program.
 *
 * The access modifier 'private' indicates that the class, top-level property or top-level function
 * are accessible only inside the file.
 * */

//top-level property
private var index: Int = 0;

//private class
private class Animal(val name: String);

//private top-level function
private fun recordAnimal(animal: Animal)
{
    println("Animal $index: ${animal.name}")
    index+=1;
};

//Top-level function that can access the top-level property and the parameter's constructor
fun recordAnimal()
{
    recordAnimal(Animal("Tiger"));
    recordAnimal(Animal("Antelope"));
};//end of recordAnimal()

fun recordAnimalsCount()
{
    println("$index animals are here!");
};//end of recordAnimalsCount();

fun main()
{
    recordAnimal();
    recordAnimalsCount();
};//end of main()