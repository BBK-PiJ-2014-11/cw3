/**
 * Created by Ehshan
 */
public class FunctionalLinkedList extends LinkedList implements FunctionalList {

    public FunctionalLinkedList() {
        //head?
    }


    public ReturnObject head() {
        if (isEmpty()) {
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        } else {
            return new ReturnObjectImpl(get(0).getReturnValue());
        }
    }

    public FunctionalList rest() {
        FunctionalLinkedList newList = new FunctionalLinkedList();
        if (!isEmpty()) {
            for (int i = 1; i < size(); i++) {
                Object item = get(i).getReturnValue();
                newList.add(item);
            }
        }
        return newList;
    }

}
