/**
 *{@inheritDoc}
 *
 *@author Ehshan Veerabangsa
 */
public class FunctionalLinkedList extends LinkedList implements FunctionalList {

    /**
     *FunctionalLinkedList class constructor
     */
    public FunctionalLinkedList() {
        super();
    }

    /**
     * {@inheritDoc}
     */
    public ReturnObject head() {
        if (isEmpty()) {
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        }else{
            return new ReturnObjectImpl(get(0).getReturnValue());
        }
    }

    /**
     * {@inheritDoc}
     */
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
