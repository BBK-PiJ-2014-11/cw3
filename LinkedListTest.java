import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Ehshan Veerabangsa
 *
 */

public class LinkedListTest {

    LinkedList newList;
    LinkedList emptyList;

    public LinkedListTest(){
        newList = new LinkedList();
        emptyList = new LinkedList();
    }

    @Before
    public void createList(){
        newList.add(1);
        newList.add("two");
        newList.add(3.0);
        newList.add("4");
        newList.add("funf");
        newList.add("seis");
    }

    @After
    public void kill(){
        newList = null;
    }


    @Test
    public void testEmpty(){
        assertTrue(emptyList.isEmpty());
    }

    @Test
    public void testSize(){
        Assert.assertEquals(newList.size(), 6);
    }

    @Test
    public void testGet(){
        Assert.assertEquals(newList.get(4).getReturnValue(), "funf");
    }

    @Test
    public void testGetOutOfBounds(){
        Assert.assertEquals(newList.get(-1).getReturnValue(), (ErrorMessage.INDEX_OUT_OF_BOUNDS));
    }

    @Test
    public void testAddWithSize(){
        newList.add("7.00");
        Assert.assertEquals(newList.size(), 7);
    }

    @Test
    public void testAddWithGet(){
        newList.add("7.00");
        Assert.assertEquals(newList.get(6).getReturnValue(), "7.00");
    }

    @Test
    public void testAddArray(){
        String[] arrayOfTens= {"ten","diez","dix","zehn","dieci"};
        newList.add(arrayOfTens);
        Assert.assertEquals(newList.size(), 7);
    }

    @Test
    public void testRemoveWithSize(){
        newList.remove(0);
        Assert.assertEquals(newList.size(), 5);
    }

    @Test
    public void testRemoveWithGet(){
        newList.remove(0);
        Assert.assertEquals(newList.get(0).getReturnValue(), "two");
    }

    @Test
    public void testRemoveOnlyObject(){
        LinkedList testList = new LinkedList();
        testList.add("one");
        testList.remove(0);
        assertTrue(testList.isEmpty());
    }

    @Test
    public void testAddWithIndex(){
        newList.add(0, "zero");
        Assert.assertEquals(newList.get(0).getReturnValue(), "zero");
    }

    @Test
    public void testAddWithIndexEmptyList(){
        emptyList.add(0, "zero");
        Assert.assertEquals(emptyList.get(0).getReturnValue(), (ErrorMessage.EMPTY_STRUCTURE));
    }

    @Test
    public void testAddWithIndexEndOfList(){
        newList.add(5, "five");
        Assert.assertEquals(newList.get(6).getReturnValue(), "seis");
    }

    /*
    /**
     * start of manual(aware of duplicates)
     */
    /*
    public static void main(String[] args){
        LinkedListTest test = new LinkedListTest();
        test.listTest();
        System.out.println("");

    }

    public void listTest(){
        LinkedList newList = new LinkedList();

        System.out.println("New empty list,testing if empty and returning size");
        System.out.println("------------------------------------");
        System.out.println("If list is empty print true: "+newList.isEmpty());
        System.out.println("");
        printList(newList);

        //adding objects to list
        newList.add(1);
        newList.add("two");
        newList.add(3.0);
        newList.add("4");
        newList.add("funf");
        newList.add("seis");

        //print out list objects
        System.out.println("Six objects added,testing size");
        System.out.println("------------------------------------");
        System.out.println("If list is empty print true: "+newList.isEmpty());
        System.out.println("");
        printList(newList);

        //test size;
        System.out.println("List length is "+ newList.size()+" objects");
        System.out.println("");

        //test get;
        System.out.println("Testing get method");
        System.out.println("------------------------------------");
        System.out.println("The fourth element in list is the number "+ newList.get(4).getReturnValue());
        System.out.println("");



        //test add; with object only
        System.out.println("Adding new String");
        System.out.println("------------------------------------");
        newList.add("7.00");
        System.out.println("List length is " + newList.size() + " objects");
        System.out.println("The new objects value is "+ newList.get(6).getReturnValue());
        System.out.println("");

        //test add null
        System.out.println("Adding null value");
        System.out.println("------------------------------------");
        newList.add(null);
        System.out.println("The new objects value is "+ newList.get(7).getError()+" at index position"+newList.get(7).getReturnValue());
        System.out.println("");//check returns values

        //test add new int
        System.out.println("Adding new integer");
        System.out.println("------------------------------------");
        newList.add(1000);
        System.out.println("The new objects value is "+ newList.get(7).getReturnValue());
        System.out.println("List length is "+ newList.size()+" objects");
        System.out.println("");

        //test add; (with index and object)
        System.out.println("Testing add to set index position");
        System.out.println("------------------------------------");
        newList.add(6 ,"neuf"); //recheck first add method
        System.out.println("List length is "+ newList.size()+" objects");
        System.out.println("");
        printList(newList);
        System.out.println("");

        //test remove;
        System.out.println("Testing remove method");
        System.out.println("------------------------------------");
        newList.remove(0);
        System.out.println("List length is "+ newList.size()+" objects");
        System.out.println("");
        newList.remove(5);
        System.out.println("List length is "+ newList.size()+" objects");
        System.out.println("");
        System.out.println("");

        //test errors
        System.out.println("Testing errors");
        System.out.println("------------------------------------");
        System.out.println(newList.get(0).hasError());
        System.out.println(newList.get(0).getError());
        System.out.println("");

        System.out.println("");
        print(newList);

    }


    public void printList(LinkedList list) {
        System.out.println("Printing Linked List");
        System.out.println("------------------------------------");
        list.print();
        System.out.println("");
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
