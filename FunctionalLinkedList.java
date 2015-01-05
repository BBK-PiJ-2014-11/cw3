/**
 * Created by Ehshan
 */
public class FunctionalLinkedList extends LinkedList implements FunctionalList {

    public FunctionalLinkedList(){

    }

    public ReturnObject head(){
        return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
    }

    public FunctionalList rest(){

        FunctionalLinkedList newList = new FunctionalLinkedList();
        return newList;

    }
}
