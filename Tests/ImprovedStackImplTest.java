package Tests;

import Structures.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ImprovedStackImplTest {

    List newList;
    List emptyList;
    ImprovedStack testStack;


    public ImprovedStackImplTest () {
        newList = new LinkedList();
        emptyList = new LinkedList();
        testStack = new ImprovedStackImpl(newList);
    }

    @Before
    public void createList(){
        newList.add("1.00");
        newList.add(2);
        newList.add("Three");
        newList.add("1.00");
        newList.add(2);
        newList.add("Three");
        newList.add("1.00");
        newList.add(2);
        newList.add("Three");
        newList.add("1.00");
        newList.add(2);
        newList.add("Three");
    }

    @After
    public void kill(){
        newList = null;
    }

    @Test
    public void testIsEmpty() {
        Stack testStack = new ImprovedStackImpl(emptyList);
        assertTrue(testStack.isEmpty());
    }

    @Test
    public void testNotEmpty() {
        assertFalse(testStack.isEmpty());
    }

    @Test
    public void testSize() {
        Assert.assertEquals(testStack.size(), 12);

    }

    @Test
    public void testPush() {
        testStack.push(13);
        testStack.push("fourteen");
        testStack.push("xv");
        testStack.push("6+10");
        Assert.assertEquals(testStack.size(), 16);
    }

    @Test
    public void testTop() {
        Assert.assertEquals(testStack.top().getReturnValue(), newList.get(newList.size() - 1).getReturnValue());
        Assert.assertEquals(testStack.top().getReturnValue(), newList.get(11).getReturnValue());
        Assert.assertEquals(testStack.top().getReturnValue(), "three");
    }

    @Test
    public void testTopEmpty() {
        Stack testStack = new StackImpl(emptyList);
        Assert.assertEquals(testStack.top().getReturnValue(), (ErrorMessage.EMPTY_STRUCTURE));
    }

    @Test
    public void testPushTop() {
        testStack.push(13);
        testStack.push("fourteen");
        testStack.push("xv");
        testStack.push("6+10");
        Assert.assertEquals(testStack.top().getReturnValue(), "6+10");
    }

    @Test
    public void testPop() {
        Assert.assertEquals(testStack.pop().getReturnValue(), "Three");
        Assert.assertEquals(testStack.pop().getReturnValue(), 2);
        Assert.assertEquals(testStack.pop().getReturnValue(), "1.00");
    }

    @Test
    public void testPopAll() throws Exception {
        for (int i = testStack.size(); i > 0; i--) {
            testStack.pop();
        }
        assertTrue(testStack.isEmpty());
    }

    @Test
    public void testPopEmpty() {
        Stack testStack = new StackImpl(emptyList);
        Assert.assertEquals(testStack.pop().getError(), (ErrorMessage.EMPTY_STRUCTURE));
    }

    @Test
    public void testReverseEmpty() {
        testStack = new ImprovedStackImpl(emptyList);
        testStack.push(1);
        testStack.pop();
        ImprovedStack reverseStack = testStack.reverse();
        assertTrue(testStack.isEmpty());
        Assert.assertEquals(reverseStack.top().getReturnValue(), (ErrorMessage.EMPTY_STRUCTURE));
    }

    @Test
    public void testReverse() {
        ImprovedStack reverseStack = testStack.reverse();
        Assert.assertEquals(testStack.size(), 12);
        Assert.assertEquals(reverseStack.top().getReturnValue(), "Three");
    }

    @Test
    public void testRemove() {
        Assert.assertEquals(testStack.size(), 12);
        testStack.remove("Three");
        Assert.assertEquals(testStack.top().getReturnValue(), 2);
        Assert.assertEquals(testStack.size(), 8);
    }

}