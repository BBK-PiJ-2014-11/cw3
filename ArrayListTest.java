import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * @author Ehshan Veerabangsa
 */
public class ArrayListTest {

    ArrayList newArrayList;
    ArrayList emptyArrayList;

    public ArrayListTest(){
        newArrayList = new ArrayList();
        emptyArrayList = new ArrayList();
    }

    @Before
    public void createList(){
        newArrayList.add("1.00");
        newArrayList.add(2);
        newArrayList.add("Three");
        newArrayList.add(4.0);
        newArrayList.add("funf");
        newArrayList.add("seis");
        newArrayList.add("sieben");
        newArrayList.add(8);
        newArrayList.add("neuf");
        newArrayList.add(1010);
        newArrayList.add(11);
        newArrayList.add("11+1");
    }

    @After
    public void kill(){
        newArrayList = null;
    }

    @Test
    public void testEmpty(){
        assertTrue(emptyArrayList.isEmpty());
    }

    @Test
    public void testNotEmpty(){
        assertFalse(newArrayList.isEmpty());
    }

    @Test
    public void testAdd(){
        emptyArrayList.add(0);
        assertFalse(emptyArrayList.isEmpty());
    }

    @Test
    public void testSize(){
        Assert.assertEquals(newArrayList.size(), 12);
    }

    @Test
    public void testGet(){
        Assert.assertEquals(newArrayList.get(0).getReturnValue(), "1.00");
        Assert.assertEquals(newArrayList.get(1).getReturnValue(), 2);
        Assert.assertEquals(newArrayList.get(2).getReturnValue(), "Three");
        Assert.assertEquals(newArrayList.get(3).getReturnValue(), 4.0);
        Assert.assertEquals(newArrayList.get(4).getReturnValue(), "funf");
        Assert.assertEquals(newArrayList.get(5).getReturnValue(), "seis");
        Assert.assertEquals(newArrayList.get(6).getReturnValue(), "sieben");
        Assert.assertEquals(newArrayList.get(7).getReturnValue(), 8);
        Assert.assertEquals(newArrayList.get(8).getReturnValue(), "neuf");
        Assert.assertEquals(newArrayList.get(9).getReturnValue(), 1010);
        Assert.assertEquals(newArrayList.get(10).getReturnValue(), 11);
        Assert.assertEquals(newArrayList.get(11).getReturnValue(), "11+1");
    }

    @Test
    public void testGetEmpty(){
        Assert.assertEquals(emptyArrayList.get(0).getReturnValue(), (ErrorMessage.EMPTY_STRUCTURE));
    }


    @Test
    public void testGetOutOfBounds(){
        Assert.assertEquals(newArrayList.get(-1).getReturnValue(), (ErrorMessage.INDEX_OUT_OF_BOUNDS));
        Assert.assertEquals(newArrayList.get(13).getReturnValue(), (ErrorMessage.INDEX_OUT_OF_BOUNDS));
    }

    @Test
    public void testRemoveWithSize(){
        newArrayList.remove(0);
        Assert.assertEquals(newArrayList.size(), 11);
    }

    @Test
    public void testRemoveWithGet(){
        newArrayList.remove(0);
        Assert.assertEquals(newArrayList.get(0).getReturnValue(), 2);
    }

    @Test
    public void testRemoveOnlyObject(){
        emptyArrayList.add("one");
        emptyArrayList.remove(0);
        assertTrue(emptyArrayList.isEmpty());
    }

    @Test
    public void testRemoveEmpty(){
        emptyArrayList.remove(0);
        Assert.assertEquals(emptyArrayList.get(0).getReturnValue(), (ErrorMessage.EMPTY_STRUCTURE));
    }

    @Test
    public void testAddWithSize(){
        newArrayList.add("7.00");
        Assert.assertEquals(newArrayList.size(), 13);
    }

    @Test
    public void testAddWithGet(){
        newArrayList.add("7.00");
        Assert.assertEquals(newArrayList.get(12).getReturnValue(), "7.00");
    }

    @Test
    public void testAddInteger(){
        newArrayList.add(111);
        Assert.assertEquals(newArrayList.get(12).getReturnValue(), 111);
    }

    @Test
    public void testAddArray(){
        String[] arrayOfTens= {"ten","diez","dix","zehn","dieci"};
        newArrayList.add(arrayOfTens);
        Assert.assertEquals(newArrayList.size(), 13);
    }

    @Test
    public void testAddWithIndex(){
        newArrayList.add(0, "zero");
        Assert.assertEquals(newArrayList.get(0).getReturnValue(), "zero");
    }

    @Test
    public void testAddWithIndexEmptyList(){
        emptyArrayList.add(0, "zero");
        Assert.assertEquals(emptyArrayList.get(0).getReturnValue(), (ErrorMessage.EMPTY_STRUCTURE));
    }

    @Test
    public void testAddWithIndexLast(){
        newArrayList.add(11, 1011);
        Assert.assertEquals(newArrayList.get(11).getReturnValue(), 1011);
        Assert.assertEquals(newArrayList.get(12).getReturnValue(), "11+1");
    }

    @Test
    public void testAddNull(){
        newArrayList.add(null);
        Assert.assertEquals(newArrayList.size(), 12);
        Assert.assertEquals(newArrayList.get(12).getReturnValue(), (ErrorMessage.INDEX_OUT_OF_BOUNDS));
    }

    @Test
    public void testAddWithIndexEqualsSize(){
        newArrayList.add(12, "ten");
        Assert.assertEquals(newArrayList.get(12).getReturnValue(), (ErrorMessage.INDEX_OUT_OF_BOUNDS));
    }

    @Test
    public void testArrayExtender(){
        newArrayList.add("Friday the 13th");
        Assert.assertEquals(newArrayList.get(12).getReturnValue(), "Friday the 13th");
    }

    /*
    public static void main(String[] args){
        ArrayListTest aTest = new ArrayListTest();
        aTest.listTest();
        System.out.println("");

    }

    public void listTest() {
        ArrayList newArrayList = new ArrayList();

        System.out.println("New empty list,testing if empty and returning size");
        System.out.println("------------------------------------");
        System.out.println("If list is empty print true: " + newArrayList.isEmpty());
        System.out.println("");
        print(newArrayList);
        System.out.println("");

        //test add; with object only
        System.out.println("Adding new String");
        System.out.println("------------------------------------");
        newArrayList.add("1.00");
        System.out.println("List length is " + newArrayList.size() + " objects");
        System.out.println("The new objects value is "+ newArrayList.get(0).getReturnValue());
        System.out.println("");

        System.out.println("Adding new Integer");
        System.out.println("------------------------------------");
        newArrayList.add(2);
        System.out.println("List length is " + newArrayList.size() + " objects");
        System.out.println("The new objects value is "+ newArrayList.get(1).getReturnValue());
        System.out.println("");

        //test add; with object and index position
        System.out.println("Adding new string at index 1");
        System.out.println("------------------------------------");
        newArrayList.add(1, "3-1");
        System.out.println("List length is " + newArrayList.size() + " objects");
        System.out.println("The new objects value is "+ newArrayList.get(1).getReturnValue());
        System.out.println("");
        //nb review method


        //test get;
        System.out.println("Testing get method");
        System.out.println("------------------------------------");
        System.out.println("The element at index[1] is the number "+ newArrayList.get(1).getReturnValue());
        System.out.println("");
        print(newArrayList);
        System.out.println("");

        System.out.println("Testing remove method");
        System.out.println("------------------------------------");
        newArrayList.remove(0);
        System.out.println("List length is "+ newArrayList.size()+" objects");
        System.out.println("");
        print(newArrayList);
        System.out.println("");

        System.out.println("Testing add + extending array");;
        System.out.println("------------------------------------");
        newArrayList.add("3");
        newArrayList.add("Four");
        newArrayList.add(5.0);
        newArrayList.add("seis");
        newArrayList.add("sieben");
        newArrayList.add(8);
        newArrayList.add("neuf");
        newArrayList.add(1010);
        newArrayList.add(11);
        newArrayList.add("11+1");
        newArrayList.add("Friday the 13th");
        System.out.println("List length is " + newArrayList.size() + " objects");

        System.out.println("");
        print(newArrayList);

    }

    public void print(List list) {
        System.out.println("List with index positions and values");
        System.out.println("------------------------------------");
        if(list.isEmpty()) {
            System.out.println("Empty List");
        } else {
            for(int i=0; i < list.size(); i++) {
                System.out.println("Index " + i + ": " + list.get(i).getReturnValue());
            }
        }
        System.out.println("Length: " + list.size());
    }
    */
}
