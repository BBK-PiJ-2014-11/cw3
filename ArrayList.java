/**
 * Created by Ehshan
 */
public class ArrayList implements List {
    private Object[] array;
    private int arraySize;

    public ArrayList() {
        array = new Object[11];
        arraySize = 0;
    }

    public boolean isEmpty() {
        if (arraySize == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int size(){
        return arraySize;
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
