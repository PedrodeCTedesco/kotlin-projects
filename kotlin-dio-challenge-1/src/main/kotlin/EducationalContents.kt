/** EducationalContents occurs on specific stacks*/

package org.conductor
import kotlin.collections.ArrayList;

class EducationalContents (
    private var acceptMultipleStudents: Boolean,
    private val educationalContents: ArrayList<String>
) {
    //Top-level property

    //Client member function
    private fun getAcceptingNewStudents() = acceptMultipleStudents;

    private fun getEducationalContents(): String
    {
        val builder = StringBuilder(); //to create a String from the ArrayList<String>
        val lastIndex = educationalContents.size - 1; //the last index of the collection

        for ((index, ed) in educationalContents.withIndex())
        {
            builder.append(ed) //to get every member of educationalContents
            if (index < lastIndex)
                builder.append(", ")
            else
                builder.append(".")
        };//end of for loop

        return builder.toString();
    };//end of showEducationalContents();

    fun toggleAcceptingNewStudents() =
        if (getAcceptingNewStudents())
            acceptMultipleStudents = false
        else
            acceptMultipleStudents = true;

    override fun toString(): String {
        return String.format("Our educational contents are ${getEducationalContents()}\n" +
                "Right now our program' status to accept new students is: ${getAcceptingNewStudents()}.");
    }
};//end of EducationalContents