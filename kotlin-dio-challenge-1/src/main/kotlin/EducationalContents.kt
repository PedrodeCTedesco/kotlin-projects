/** EducationalContents occurs on specific stacks*/

package org.conductor
import kotlin.collections.ArrayList;

class EducationalContents (
    private val acceptMultipleStudents: Boolean,
    private val educationalContents: ArrayList<String>
) {
    //Top-level property

    //Client member function
    fun acceptingNewStudents() = acceptMultipleStudents;

    fun showEducationalContents()
    {
        println("Our educational contents are: ");
        for (i in 0 until educationalContents.size)
        {
            print("${educationalContents[i]}\n")
        };//end of for loop
    }
};//end of EducationalContents