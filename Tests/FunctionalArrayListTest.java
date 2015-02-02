package Tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 *@author Ehshan Veerabangsa
 */
public class FunctionalArrayListTest {

    FunctionalList newList;
    FunctionalList emptyList;

    public  FunctionalArrayListTest () {
        newList = new FunctionalArrayList();
        emptyList = new FunctionalArrayList();
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
    public void testEmptyHead() {
        Assert.assertEquals(emptyList.head().getReturnValue(), (ErrorMessage.EMPTY_STRUCTURE));
    }

    @Test
    public void testHead() {
        Assert.assertEquals(newList.head().getReturnValue(), "1.00");
    }

    @Test
    public void testEmptyRest() {
        Assert.assertEquals(emptyList.rest().get(0).getReturnValue(), (ErrorMessage.EMPTY_STRUCTURE));
    }

    @Test
    public void testRest() {
        for (int i = 0; i < newList.size(); i++) {
            int j = i + 1;
            Assert.assertEquals(newList.rest().get(i).getReturnValue(), newList.get(j).getReturnValue());
        }
    }


    /*
    public static void main(String[] args){
        Tests.FunctionalArrayListTest fArrayTest = new Tests.FunctionalArrayListTest();
        fArrayTest.headTest();
        System.out.println("");

        fArrayTest.restTest();
        System.out.println("");

    }

    public void headTest() {
        FunctionalList testList = new FunctionalArrayList();

        System.out.println("Testing head");
        System.out.println("------------------------------------");
        testList.add("1");
        System.out.println("Value of head is "+testList.head().getReturnValue());
    }

    public void restTest() {
        FunctionalList testList = new FunctionalArrayList();
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(4);

        FunctionalList restList = testList.rest();
        System.out.println("Testing head");
        System.out.println("------------------------------------");
        System.out.println("Below should match");
        System.out.println(restList.get(0).getReturnValue());
        System.out.println(testList.get(1).getReturnValue());


    }
    */

}
