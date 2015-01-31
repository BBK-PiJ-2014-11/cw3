/**
 *@author Ehshan Veerabangsa
 *
 */
public class StackImpl extends AbstractStack {

    /**
     *Stack Impl class constructor
     *
     * @param list - the internal list  - The data structure where the elements on the stack are stored.
     */
    public StackImpl(List list){
        super(list);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isEmpty(){
        return internalList.isEmpty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int size(){
        return internalList.size();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void push(Object item){
        internalList.add(item);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReturnObject top(){
        if (isEmpty()) {
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        } else {
            return internalList.get(size()-1);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReturnObject pop(){
        if (isEmpty()) {
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        } else {
            return internalList.remove(size()-1);
        }
    }
}
