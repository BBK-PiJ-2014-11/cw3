import org.junit.Test;

import static org.junit.Assert.*;
/**
 * @author Ehshan Veerabangsa
 */
public class ReturnObjectImplTest {

    ReturnObject one;
    ReturnObject two;
    ReturnObject three;
    ReturnObject four;
    ReturnObject five;
    ReturnObject six;
    String[] arrayOfTens= {"ten","diez","dix","zehn","dieci"};

    public ReturnObjectImplTest () {
        one = new ReturnObjectImpl(1);
        two = new ReturnObjectImpl("two");
        three = new ReturnObjectImpl(arrayOfTens);
        four = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
        five = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        six = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
    }

    @Test
    public void testHasNoError() {
        assertFalse(one.hasError());
        assertFalse(two.hasError());
        assertFalse(three.hasError());
    }

    @Test
    public void testHasError() {;
        assertTrue(four.hasError());
        assertTrue(five.hasError());
        assertTrue(six.hasError());
    }


    @Test
    public void testGetError() {
        assertEquals(one.getError(), ErrorMessage.NO_ERROR);
        assertEquals(two.getError(), ErrorMessage.NO_ERROR);
        assertEquals(three.getError(), ErrorMessage.NO_ERROR);
        assertEquals(four.getError(), ErrorMessage.INVALID_ARGUMENT);
        assertEquals(five.getError(), ErrorMessage.EMPTY_STRUCTURE);
        assertEquals(six.getError(), ErrorMessage.INDEX_OUT_OF_BOUNDS);
    }

    @Test
    public void testGetReturnValue() {
        assertEquals(one.getReturnValue(), 1);
        assertEquals(two.getReturnValue(), "two");
        assertEquals(three.getReturnValue(), arrayOfTens);
        assertEquals(four.getReturnValue(), ErrorMessage.INVALID_ARGUMENT);
        assertEquals(five.getReturnValue(), ErrorMessage.EMPTY_STRUCTURE);
        assertEquals(six.getReturnValue(), ErrorMessage.INDEX_OUT_OF_BOUNDS);
    }

}