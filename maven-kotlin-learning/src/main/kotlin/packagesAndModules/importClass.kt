/** In Kotlin, we can use a 'module' as a top-level concept of organization of our code. Inside a
 * module we can have multiple packages; note that the module must be a logically independent part
 * of a codebase.
 * A package is an associated collection of code. Each package is usually design to solve a particular
 * problem, and ofter contains multiple functions and classes.
 * @author pedro de castro tedesco
 * @since 12/02/2024
 * @see "Atomic Kotlin"
 * */

package org.conductor.packagesAndModules

//the 'import' keyword is used to reuse code from another package or module in out code.
//One way to use 'import' is to specify a class, function or property name:
// import packagename.ClassName;
// import packagename.functionName;
// import packagename.propertyName;

//import kotlin.math.PI;
//import kotlin.math.cos;

/** Sometimes we may want to use multiple third-party libraries that have the same identifier for
 * their functions or properties. To deal with if we can use de 'as' keyword to change that identifier
 * and help us to understand the origin of the function, class or property.
 * */

import kotlin.math.PI as circleRatio;
import kotlin.math.cos as cosine;
import kotlin.math.*;

fun main()
{
    //println(PI);
    //println(cos(PI));
    //println(cos(2 * PI));

    println(circleRatio);
    println(cosine(circleRatio));
    println(cosine(2 * circleRatio));

    /** We can fully qualify an import in the body of our code.
     * */
    println(kotlin.math.PI);
    println(kotlin.math.cos(kotlin.math.PI));
    println(kotlin.math.cos(2 * kotlin.math.E));

};//end of main()