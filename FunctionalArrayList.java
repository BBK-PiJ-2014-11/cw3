/**
 * Created by Ehshan
 */
public class FunctionalArrayList extends ArrayList implements FunctionalList {

    public FunctionalArrayList(){

    }

    public ReturnObject head(){
        return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
    }

    public FunctionalList rest(){

        FunctionalArrayList newList = new FunctionalArrayList();
        return newList;
    }

}
