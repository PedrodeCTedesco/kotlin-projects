/** To create a package we just have to use the keyword 'package' followed by the name in lowercase.*/

package org.conductor.packagesAndModules

import kotlin.math.sqrt;

class RightTriangle (
    val a: Double,
    val b: Double
) {
    //client member functions
    fun hypoteneuse () = sqrt(a * a + b * b);
    fun area() = a * b / 2;
}