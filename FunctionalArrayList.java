/**
 * Created by Ehshan
 */
public class FunctionalArrayList extends ArrayList implements FunctionalList {

    public FunctionalArrayList(){
        //
    }

    public ReturnObject head(){
        if (isEmpty()) {
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        }
        Object head = get(0).getReturnValue();
        return new ReturnObjectImpl(head);
    }

    public FunctionalList rest(){
        if (isEmpty()) {
            FunctionalList emptyList = new FunctionalArrayList();
            return emptyList;
        } else {
            FunctionalList newArrayList = new FunctionalArrayList();
            for (int i = 1; i < size(); i++) {
                Object item = get(i).getReturnValue();
                newArrayList.add(item);
            }
            return newArrayList;
        }
    }

}
