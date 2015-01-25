/**
 * Created by Ehshan
*/

public class ImprovedStackImpl implements ImprovedStack {
    private List improvedStack;

    public ImprovedStackImpl(List list){
        improvedStack = list;
    }


    public ImprovedStack reverse() {
        return null;
    }

    public void remove(Object object) {

    }

    @Override
    public boolean isEmpty() {
        return improvedStack.isEmpty();
    }

    @Override
    public int size() {
        return improvedStack.size();
    }

    @Override
    public void push(Object item) {

        improvedStack.add(item);

    }

    @Override
    public ReturnObject top() {

        if (isEmpty()) {
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        } else {
            return improvedStack.get(0);
        }
    }

    @Override
    public ReturnObject pop() {

        if (isEmpty()) {
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        } else {
            return improvedStack.remove(0);
        }

    }
}
