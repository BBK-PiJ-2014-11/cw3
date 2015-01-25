/**
 * Created by Ehshan
 */
public class StackImpl extends AbstractStack {

    public StackImpl(List list){
        super(list);
    }

    public boolean isEmpty(){

        return internalList.isEmpty();

    }

    public int size(){

        return internalList.size();

    }

    public void push(Object item){

        internalList.add(item);

    }

    public ReturnObject top(){

        if (isEmpty()) {
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        } else {
            return internalList.get(0);
        }

    }

    public ReturnObject pop(){

        if (isEmpty()) {
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        } else {
            return internalList.remove(0);
        }

    }
}
