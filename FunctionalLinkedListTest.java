/**
 * Created by Ehshan
 */
public class FunctionalLinkedListTest {

    public static void main(String[] args){
        FunctionalLinkedListTest fListTest = new FunctionalLinkedListTest();
        fListTest.headTest();
        System.out.println("");

        fListTest.restTest();
        System.out.println("");

    }

    public void headTest() {
        FunctionalList testList = new FunctionalLinkedList();

        System.out.println("Testing head");
        System.out.println("------------------------------------");
        testList.add("1");
        System.out.println("Value of head is "+testList.head().getReturnValue());
    }


    public void restTest() {
        FunctionalList testList = new FunctionalLinkedList();
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(4);


        System.out.println("Testing rest");
        System.out.println("------------------------------------");
        System.out.println("Below should match");

        System.out.println(testList.rest().get(0).getReturnValue());
        System.out.println(testList.get(1).getReturnValue());
        System.out.println(">>");
        System.out.println(testList.rest().get(2).getReturnValue());
        System.out.println(testList.get(3).getReturnValue());

    }

}




