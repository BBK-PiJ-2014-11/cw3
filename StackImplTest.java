/**
 * Created by Ehshan
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class StackImplTest{

    @Test
    public void testIsEmpty() throws Exception {

        LinkedList newList = new LinkedList();
        AbstractStack newStack = new StackImpl(newList);
        assertTrue(newStack.isEmpty());

    }

    @Test
    public void testNotEmpty() throws Exception {

        LinkedList newList = new LinkedList();
        newList.add(1);
        newList.add("two");
        newList.add(3.0);
        newList.add("4");
        newList.add("funf");
        newList.add("seis");
        AbstractStack newStack = new StackImpl(newList);
        assertFalse(newStack.isEmpty());

    }

    @Test
    public void testSize() throws Exception {

        LinkedList newList = new LinkedList();
        newList.add(1);
        newList.add("two");
        newList.add(3.0);
        newList.add("4");
        newList.add("funf");
        newList.add("seis");
        AbstractStack newStack = new StackImpl(newList);
        assertEquals(newStack.size(),6);

    }

    @Test
    public void testPush() throws Exception {
        LinkedList newList = new LinkedList();
        AbstractStack newStack = new StackImpl(newList);
        newStack.push(1);
        newStack.push("two");
        newStack.push(3.0);
        newStack.push("4");
        newStack.push("funf");
        newStack.push("seis");
        assertEquals(newStack.size(),6);
    }

    @Test
    public void testTop() throws Exception {
        LinkedList newList = new LinkedList();
        AbstractStack newStack = new StackImpl(newList);
        newStack.push(1);
        newStack.push("two");
        newStack.push(3.0);
        newStack.push("4");
        newStack.push("funf");
        newStack.push("seis");
        assertEquals(newList.get(0).getReturnValue(), newStack.top().getReturnValue());

    }

    @Test
    public void testPop() throws Exception {
        LinkedList newList = new LinkedList();
        AbstractStack newStack = new StackImpl(newList);
        newStack.push(1);
        newStack.push("two");
        newStack.push(3.0);
        newStack.push("4");
        newStack.push("funf");
        newStack.push("seis");
        assertEquals(newList.get(0).getReturnValue(), newStack.pop().getReturnValue());

    }
}