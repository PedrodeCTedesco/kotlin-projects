package kotlinBasics

/** This is for syntax of iteration declaration's in Kotlin
 * */

fun main() {
    println("--the while--");

    //the boolean condition is evaluated once at the beginning of the loop and again before each further iteration

    fun condition(i: Int): Boolean = i < 100;
    var i = 0;
    while (condition(i)) {
        print(".");
        i += 10;
    };//end of while loop

    var n = 10;
    var d = 3;
    print(n);
    while(n > d)
    {
        n -= d;
        print(" - $d")
    }
    println(" = $n");

    println("-- do...while --");
    // The code on the do block will execute at least one time even if the condition is evaluated to false

    fun newCondition(j: Int): Boolean = j < 20;
    var j = 0;
    do {
        println("code of do block");
        j += 1;
    } while (newCondition(j))
       print("while block --")

    println("-- for declaration and ranges --");
    //the for keyword executes a block of code for each value in a sequence.
    /** The 'in' keyword is used to indicate that you are stepping through values
     * Like:
     *
     * for (v in values)
     * {
     *      //do something with v
     * }
     *
     * */

    for (i in 1..5)
    {
        println("Hey $i")
    };//end of for loop

    /** The ranges can be defined in two basic ways:
     *
     * 1) Using the .. opeartor that includes the start and the end (1..5) will be 1, 2, 3, 4, 5
     *
     * 2) Using the 'until' keyword that leaves the right value out (0 until 10) will be 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
     *
     * We can use ranges in expression to be evaluated.
     * */

    val range1 = 1..19;
    val range2 = 1 until 19;
    println(range1);
    println(range2);

    var sum = 0;
    for (n in 10..100)
    {
        sum+=n;
    }
    println("sum = $sum");

    println("Other options:")

    fun showRange(r: IntProgression): Unit
    {
        for (i in r)
        {
            print("$i ")
        };//end of for loop
        print("          // $r");
        println();
    };//end of showRange(r: IntProgression):Unit

    showRange(1..5); //using the .. operator
    showRange(0 until 5); //using the 'until' keyword
    showRange(5 downTo 1); //using the 'downTo' keyword;
    showRange(0..9 step 2); //using the .. operator and the 'step' keyword to "jump by 2"
    showRange(0 until 10 step 3); //using the 'until' keyword and the 'step'
    showRange(20 downTo 1 step 5);

    println("Produce a range of characters")

    for(word in 'a'..'z')
        print(" $word");

    /** Square brackets access characters index position. Since we start counting the index at 0,
     * something like val s: String = "Pedro" s[0] would return "P".
     *
     * We can use s.lastIndex to return the last index of the String.
     * */
    println();
    val s: String = "Odcqn";
    for (i in 0..s.lastIndex)
    {
        print(s[i] + 1)
    };//end of for loop

    /** Note that characters are stored as numbers corresponding to their ASCII codes. So adding
     * an integer to a character produces a new character corresponding to the new code value.
     *
     * Also, we can compare character codes because we are using their ASCII number.
     * */
    val ch: Char = 'f';
    println("New character: ${ch + 21}");

    println("Iterate a String to find a match");

    fun hasChar(ch: Char): Boolean
    {
        for (c in s)
        {
            if (c == ch) return true;
        };//end of for loop
        return false
    };//end of hasChar(ch: Char):Boolean

    println(hasChar('r'));

    /** We can use a built-in library in Kotlin called repeat() to repeat an action
     * a fixed number of times like the following example
     * */
    repeat(3)
    {
        println("Lua")
    };//end of repeat();

}//end of main()