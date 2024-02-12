package org.conductor.objectsInKotlin.constructorsBasicsImmutableAndMutableObj

class Cup
{
    //A property is a val or var that's part of a class. Defining a property maintains state within a class.
    //To invoke a property of an object we must use dot notation and the name of the property.
    var percentFull: Int = 0;
};//end of Cup class

class Cup2
{
    var percentuFull: Int = 0;
    val max: Int = 100;

    fun add(increase: Int): Int
    {
        //We don't need to use 'this' to percentFull reference. Another thing: we can
        //use the properties ('fields') anywhere inside the class without explicitly reference.
        percentuFull += increase;
        if(percentuFull > max)
            percentuFull = max;
        return percentuFull;
    };//end of add(Increase: Int): Int
};//end of Cup2 class

fun main()
{
    val c1 = Cup();
    c1.percentFull = 50;
    val c2 = Cup();
    c2.percentFull = 100;

    println(c1.percentFull);
    println(c2.percentFull);

    val cup2 = Cup2();
    cup2.add(50);
    println(cup2.percentuFull);
    cup2.add(70);
    println(cup2.percentuFull);

}
