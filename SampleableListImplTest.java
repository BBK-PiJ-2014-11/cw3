/**
 * Created by Ehshan
 */
public class SampleableListImplTest {

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
        SampleableList testList = new SampleableListImpl(newLinkedList);
        testList.add(1);
        testList.add("two");
        testList.add(3.0);
        testList.add("4");
        testList.add("funf");
        testList.add("seis");
        print(testList);
        //System.out.println("Sample: "+testList.sample());
        System.out.println("");

        System.out.println("Testing an ARRAY List");
        System.out.println("------------------------------------");
        SampleableList testAList = new SampleableListImpl(newArrayList);
        testAList.add(1);
        testAList.add("two");
        testAList.add(3.0);
        testAList.add("4");
        testAList.add("funf");
        testAList.add("seis");
        print(testAList);
        //System.out.println("Sample: "+testAList.sample());
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

}
