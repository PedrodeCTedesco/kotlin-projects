/** The Formations object must have:
 * (a) Properties: 1) name; 2) level; 3) An instance of ConteudosEducacionais; 4) stacks tecnológicas (array)
 * */

package org.conductor

import kotlin.collections.ArrayList;

class Formations (
    private val name: String,
    private val level: Int,
    private val educationalContent: EducationalContents,
    private val stacks: ArrayList<String>
) {
    //Client member functions
    private fun getName(): String = name;

    private fun getLevel(): Int = level;

    private fun getEducationalContents(): EducationalContents {
        return educationalContent;
    };//end of getEducationalContents()

    private fun getStacks(): String
    {
        //same logic of getEducationalContents()
        val builder = StringBuilder();
        val lastIndex = stacks.size - 1;

        for ((index, stk) in stacks.withIndex())
        {
            builder.append(stk)
            if (index < lastIndex)
                builder.append(", ")
            else
                builder.append(".")
        };//end of for loop
        return builder.toString()
    };//end of getStacks()

    override fun toString(): String
    {
        return String.format(
            "Course name: ${getName()}%nLevel: ${getLevel()}. " +
                    "We teach our course to the following stacks: ${getStacks()}" +
                    "%nEducational contents: ${getEducationalContents()}%n");
    };//end of toString()
};//end of Formations class