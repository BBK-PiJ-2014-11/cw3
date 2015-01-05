/**
 * Created by Ehshan
*/
public class LinkedList implements List {

    private Node head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public int size(){
        return size;
    }

    public ReturnObject get(int index){

        return new ReturnObjectImpl(ErrorMessage.NO_ERROR);

    }

    public ReturnObject remove(int index){

        return new ReturnObjectImpl(ErrorMessage.NO_ERROR);

    }

    public ReturnObject add(int index, Object item){

        return new ReturnObjectImpl(ErrorMessage.NO_ERROR);

    }

    public ReturnObject add(Object item){

        return new ReturnObjectImpl(ErrorMessage.NO_ERROR);

    }

}

/**
 * RETURN VALUES TO BE ADDED
 *
 * return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
 * return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
 * return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
 * return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT;);
 */
