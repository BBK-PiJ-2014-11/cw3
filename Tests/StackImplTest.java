package Tests;

import Structures.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 *@author Ehshan Veerabangsa
 */
public class StackImplTest{

    List newList;
    List emptyList;
    Stack newStack;


    public StackImplTest() {
        newList = new LinkedList();
        emptyList = new LinkedList();
        newStack = new StackImpl(newList);
    }

    @Before
    public void createList(){
        newList.add("1.00");
        newList.add(2);
        newList.add("Three");
        newList.add(4.0);
        newList.add("funf");
        newList.add("seis");
        newList.add("sieben");
        newList.add(8);
        newList.add("neuf");
        newList.add(1010);
        newList.add(11);
        newList.add("11+1");
    }

    @After
    public void kill(){
        newList = null;
    }

    @Test
    public void testIsEmpty() {
        Stack newStack = new StackImpl(emptyList);
        assertTrue(newStack.isEmpty());
    }

    @Test
    public void testNotEmpty() {
        assertFalse(newStack.isEmpty());
    }

    @Test
    public void testSize() {
        Assert.assertEquals(newStack.size(), 12);

    }

    @Test
    public void testPush() {
        newStack.push(13);
        newStack.push("fourteen");
        newStack.push("xv");
        newStack.push("6+10");
        Assert.assertEquals(newStack.size(), 16);
    }

    @Test
    public void testTop() {
        Assert.assertEquals(newStack.top().getReturnValue(), newList.get(newList.size() - 1).getReturnValue());
        Assert.assertEquals(newStack.top().getReturnValue(), newList.get(11).getReturnValue());
        Assert.assertEquals(newStack.top().getReturnValue(), "11+1");
    }

    @Test
    public void testTopEmpty() {
        Stack newStack = new StackImpl(emptyList);
        Assert.assertEquals(newStack.top().getReturnValue(), (ErrorMessage.EMPTY_STRUCTURE));
    }

    @Test
    public void testPushTop() {
        newStack.push(13);
        newStack.push("fourteen");
        newStack.push("xv");
        newStack.push("6+10");
        Assert.assertEquals(newStack.top().getReturnValue(), "6+10");
    }

    @Test
    public void testPop() {
        Assert.assertEquals(newStack.pop().getReturnValue(), "11+1");
        Assert.assertEquals(newStack.pop().getReturnValue(), 11);
        Assert.assertEquals(newStack.pop().getReturnValue(), 1010);
    }

    @Test
    public void testPopAll() throws Exception {
        for (int i = newStack.size(); i > 0; i--) {
            newStack.pop();
        }
        assertTrue(newStack.isEmpty());
    }

    @Test
    public void testPopEmpty() {
        Stack newStack = new StackImpl(emptyList);
        Assert.assertEquals(newStack.pop().getError(), (ErrorMessage.EMPTY_STRUCTURE));
    }
}