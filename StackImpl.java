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


    }

    public ReturnObject top(){

        return new ReturnObjectImpl(internalList);
    }

    public ReturnObject pop(){

        return new ReturnObjectImpl(internalList);

    }
}
