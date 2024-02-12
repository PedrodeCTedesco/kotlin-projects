/** Here we show that even if a reference to an object is 'private' inside a class doesn't mean
 * some other object can't have a 'public' reference to the same object.
 * @author pedro de castro tedesco
 * @since 12/02/2024
 * @see "Atomic Kotlin"
 * */

package org.conductor.objectsInKotlin.visibilityControl

class Counter (var start: Int)
{
    //public member function
    fun increment()
    {
        start+=1;
    };//end of increment()

    override fun toString(): String = start.toString();
};//end of Counter class

//It's like a composition in Java. Here we have a reference to an object of Counter as a 'field' of CounterHolder.
class CounterHolder(counter: Counter)
{
    //properties
    private val ctr = counter;

    //public member functions
    override fun toString(): String = "CounterHolder: $ctr";
};//end of CounterHolder

fun main()
{
    val c = Counter(11); //we instantiate an object of Counter
    val ch = CounterHolder(c); //we pass this reference to initiate CounterHolder.

    println(ch); // implicitly invoke toString()
    c.increment(); //invoke the private member function of Counter.
    // can't call: ch.increment() because even if the 'c' reference is assign to CounterHolder ch,
    //the member function increment() is private and can only be invoked by an object of Counter.
    println(ch);

    val ch2 = CounterHolder(Counter(9)); // we instantiate CounterHolder passing the call to Counter constructor
    println(ch2);

    /** Note that maintaining multiple references to the same object (as 'c' and 'ch') is called aliasing. This
     * can generate surprising behavior and should be kept at minimum.
     * */
};//end of main()