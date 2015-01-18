/**
 * Created by Ehshan
 */
public class FunctionalArrayListTest {

    public static void main(String[] args){
        FunctionalArrayListTest fArrayTest = new FunctionalArrayListTest();
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


}
