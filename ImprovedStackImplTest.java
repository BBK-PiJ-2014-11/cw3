import org.junit.Test;

import static org.junit.Assert.*;

public class ImprovedStackImplTest {

    /**
     Testing reverse() with ArrayList
     */

    @Test
    public void testReverseEmpty() throws Exception {
        ImprovedStackImpl testStack = new ImprovedStackImpl(new ArrayList());

        testStack.push(1);
        testStack.pop();
        ImprovedStack reverseStack = testStack.reverse();
        assertEquals(reverseStack.top().getReturnValue(), (ErrorMessage.EMPTY_STRUCTURE));
    }

    @Test
    public void testReverse() throws Exception {
        ImprovedStackImpl testStack = new ImprovedStackImpl(new ArrayList());

        testStack.push(1);
        testStack.push("two");
        testStack.push(3.0);
        testStack.push("4");
        testStack.push("funf");
        testStack.push("seis");
        ImprovedStack reverseStack = testStack.reverse();
        assertEquals(reverseStack.top().getReturnValue(), 1);
    }

    /**
     Testing reverse() with LinkedList
     */

    @Test
    public void testReverseEmptyLinked() throws Exception {
        ImprovedStackImpl testStack = new ImprovedStackImpl(new LinkedList());

        testStack.push(1);
        testStack.pop();
        ImprovedStack reverseStack = testStack.reverse();
        assertEquals(reverseStack.top().getReturnValue(), (ErrorMessage.EMPTY_STRUCTURE));
    }

    @Test
    public void testReverseLinked() throws Exception {
        ImprovedStackImpl testStack = new ImprovedStackImpl(new LinkedList());

        testStack.push(1);
        testStack.push("two");
        testStack.push(3.0);
        testStack.push("4");
        testStack.push("funf");
        testStack.push("seis");
        ImprovedStack reverseStack = testStack.reverse();
        assertEquals(reverseStack.top().getReturnValue(), 1);
    }

}