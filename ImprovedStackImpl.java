/**
 * Created by Ehshan
*/

public class ImprovedStackImpl implements ImprovedStack {
    // list ok? or should it be stack? - check
    private List improvedStack;

    public ImprovedStackImpl(List list){
        improvedStack = list;
    }


    public ImprovedStack reverse() {
        ImprovedStack reverseStack = new ImprovedStackImpl(new ArrayList());
        if (isEmpty()) {
            return reverseStack;
        }else {
            for (int i = 0; i < size(); i++) {
                reverseStack.push(improvedStack.get(i).getReturnValue());
            }
        }
        return reverseStack;
    }

    public void remove(Object object) {
        //is get() + remove() allowed??? - check
        for (int i=0; i< size(); i++) {
            if (improvedStack.get(i).getReturnValue().equals(object)) {
                improvedStack.remove(i);
            }
        }
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