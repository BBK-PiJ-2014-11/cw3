package Structures;

/**
 * {@inheritDoc}
 *
 * @author Ehshan Veerabangsa
 */
public class ImprovedStackImpl implements ImprovedStack {
    private List stackList;

    /**
     * ImprovedStackImpl class constructor
     *
     * @param list - the internal list  - The data structure where the elements on the stack are stored.
     */
    public ImprovedStackImpl(List list){
        stackList = list;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImprovedStack reverse() {
        ImprovedStack reverseStack = new ImprovedStackImpl(new LinkedList());
        if (isEmpty()) {
            return reverseStack;
        }else {
            for (int i = 0; i < size(); i++) {
                reverseStack.push(stackList.get(i).getReturnValue());
            }
        }
        return reverseStack;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void remove(Object object) {
        for (int i=0; i< size(); i++) {
            if (stackList.get(i).getReturnValue().equals(object)) {
                stackList.remove(i);
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int size() {
        return stackList.size();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void push(Object item) {
        stackList.add(item);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReturnObject top() {
        if (isEmpty()) {
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        } else {
            return stackList.get(size() - 1);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReturnObject pop() {
        if (isEmpty()) {
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        } else {
            return stackList.remove(size()-1);
        }

    }
}
