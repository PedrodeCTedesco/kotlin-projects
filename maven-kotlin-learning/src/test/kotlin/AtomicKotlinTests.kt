/** This is a test class for learning how to use Kotest framework
 * @author pedro de castro tedesco
 * @since 13/02/2024
 * @see "Atomic Kotlin"
 * @see "Kotest framework and
 * */

//Kotest
import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.core.spec.style.Test;
import io.kotest.matchers.collections.shouldContainInOrder
import io.kotest.matchers.collections.shouldHaveSize
import io.kotest.matchers.ints.shouldBeExactly
import org.junit.jupiter.api.DisplayName;
import io.kotest.matchers.shouldBe;

//Project imports
import org.conductor.kotlinTesting.myName;
import org.conductor.collections.*;


@Test
@DisplayName("Standard class to Atomic Kotlin book")
class AtomicKotlinTests : AnnotationSpec()
{
    //Initialize the tests cases (from kotlin.Basics)
    @Test
    fun nameValue()
    {
        myName shouldBe ("Pedro Tedesco")
    };//end of nameValue

    //of ListClass.kt
    @Test
    fun testSizeOfTheList()
    {
        listOfInts.shouldHaveSize(10);
        listOfIntReversed.shouldHaveSize(10);
        listOfDoubles.shouldHaveSize(3);
        listOfStrings.shouldHaveSize(3);
    };//end of testSizeOfTheList();

    @Test
    fun testSizeOfMutableList()
    {
        mutableListOfInts.shouldHaveSize(2);
        mutableListOfInts.addFirst(3);
        mutableListOfInts.addLast(4);
        mutableListOfInts.shouldHaveSize(4);
    };//end of testSizeOfMutableList();

    @Test
    fun checkTheElementsOrderOfTheList()
    {
        listOfInts.shouldContainInOrder(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        listOfIntReversed.shouldContainInOrder(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        listOfDoubles.shouldContainInOrder(2.3, 1.1, 5.67);
    };//end of checkTheElementsOrderOfTheList();

    @Test
    fun checkTheSumOfElementsList()
    {
        listOfInts.sum().shouldBeExactly(55);

        test.shouldBeExactly(6);
        totalSum.shouldBeExactly(30);
        totalArraySum.shouldBeExactly(12);
    };//end of checkTheSumOfElementsList();

};//end of AtomicKotlinTests : AnnotationSpec