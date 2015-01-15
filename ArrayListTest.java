/**
 * Created by Ehshan
 */
public class ArrayListTest {

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
        newArrayList.add("7.00");
        System.out.println("List length is " + newArrayList.size() + " objects");
        System.out.println("The new objects value is "+ newArrayList.get(0).getReturnValue());
        System.out.println("");

        //test get;
        System.out.println("Testing get method");
        System.out.println("------------------------------------");
        System.out.println("The first element in list is the number "+ newArrayList.get(0).getReturnValue());
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
}
