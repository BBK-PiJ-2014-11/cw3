package Tests;

import Structures.*;
import org.junit.Assert;
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
        Assert.assertEquals(one.getError(), ErrorMessage.NO_ERROR);
        Assert.assertEquals(two.getError(), ErrorMessage.NO_ERROR);
        Assert.assertEquals(three.getError(), ErrorMessage.NO_ERROR);
        Assert.assertEquals(four.getError(), ErrorMessage.INVALID_ARGUMENT);
        Assert.assertEquals(five.getError(), ErrorMessage.EMPTY_STRUCTURE);
        Assert.assertEquals(six.getError(), ErrorMessage.INDEX_OUT_OF_BOUNDS);
    }

    @Test
    public void testGetReturnValue() {
        Assert.assertEquals(one.getReturnValue(), 1);
        Assert.assertEquals(two.getReturnValue(), "two");
        Assert.assertEquals(three.getReturnValue(), arrayOfTens);
        Assert.assertEquals(four.getReturnValue(), ErrorMessage.INVALID_ARGUMENT);
        Assert.assertEquals(five.getReturnValue(), ErrorMessage.EMPTY_STRUCTURE);
        Assert.assertEquals(six.getReturnValue(), ErrorMessage.INDEX_OUT_OF_BOUNDS);
    }

}