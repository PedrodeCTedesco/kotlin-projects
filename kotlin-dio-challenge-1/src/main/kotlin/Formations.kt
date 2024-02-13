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
)
{
    //Client member functions
    public fun getName(): String = name;

    public fun getLevel(): Int = level;

    override public fun toString(): String
    {
        return String.format(
            "Course name: $name%nLevel: $level%nEducational contents: <>%nFor the following stacks:<>");
    };//end of toString()
};//end of Formations class