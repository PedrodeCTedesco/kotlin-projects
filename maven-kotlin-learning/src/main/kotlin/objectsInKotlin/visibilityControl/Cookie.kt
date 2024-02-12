/** Showing the access modifiers for classes.
 * @author pedro de castro
 * @since 12/02/2024
 * @see "Atomic Kotlin"
 * */

package org.conductor.objectsInKotlin.visibilityControl

//We don't need to use 'public' because if we don't provide access modifiers 'public' is implied
public class Cookie (private var isReady: Boolean)
{
    //member functions
    //Implementation
    private fun crumble() = println("crumble");

    //client member functions
    public fun bite() = println("bite");

    fun eat()
    {
        isReady = true;
        crumble();
        bite();
    };//end of eat();
};//end of Cookie class

fun main()
{
    val x = Cookie(false);
    x.bite();
    x.eat();
};//end of main()