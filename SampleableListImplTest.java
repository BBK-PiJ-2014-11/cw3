import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * @author Ehshan Veerabangsa
 */
public class SampleableListImplTest {

    SampleableList sampleList;
    SampleableList emptyList;

    public  SampleableListImplTest() {
        sampleList = new SampleableListImpl();
        emptyList = new SampleableListImpl();
    }

    @Before
    public void createList(){
        sampleList.add("1.00");
        sampleList.add(2);
        sampleList.add("Three");
        sampleList.add(4.0);
        sampleList.add("funf");
        sampleList.add("seis");
        sampleList.add("sieben");
        sampleList.add(8);
        sampleList.add("neuf");
        sampleList.add(1010);
        sampleList.add(11);
        sampleList.add("11+1");
    }

    @After
    public void kill(){
        sampleList = null;
    }

    @Test
    public void testSample(){
        for (int i = 0; i < sampleList.size(); i++) {
            int j = i*2;
            assertEquals(sampleList.get(j).getReturnValue(), sampleList.sample().get(i).getReturnValue());
        }
    }

    @Test
    public void testEmptySample(){
        assertEquals(emptyList.get(0).getReturnValue(), emptyList.sample().get(0).getReturnValue());
    }

    /*
    public static void main(String[] args){
        SampleableListImplTest sampleTest = new SampleableListImplTest();
        sampleTest.sampleTest();
        System.out.println("");

    }

    public void sampleTest() {
        LinkedList newLinkedList = new LinkedList();
        ArrayList newArrayList = new ArrayList();


        System.out.println("Testing a Linked List");
        System.out.println("------------------------------------");
        SampleableList testList = new SampleableListImpl();
        testList.add(1);
        testList.add("two");
        testList.add(3.0);
        testList.add("4");
        testList.add("funf");
        testList.add("seis");
        print(testList);
        System.out.println("");
        System.out.println("Sample: "+testList.sample());
        System.out.println("");

        System.out.println("Testing an ARRAY List");
        System.out.println("------------------------------------");
        SampleableList testAList = new SampleableListImpl();
        testAList.add(1);
        testAList.add("two");
        testAList.add(3.0);
        testAList.add("4");
        testAList.add("funf");
        testAList.add("seis");
        print(testAList);
        System.out.println("");
        System.out.println("size: "+testAList.sample().get(0));
        print(testAList.sample());
    }


    public void print(SampleableList list) {
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
