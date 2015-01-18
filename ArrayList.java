/**
 * Created by Ehshan
 */
public class ArrayList implements List {
    private Object[] array;
    private int arraySize;
    private static int setSize = 11;

    public ArrayList() {
        array = new Object[setSize];
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

    public ReturnObject get(int index) {
        if (isEmpty()) {
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        } else if(index < 0 || index > size()){
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        }else{
            return new ReturnObjectImpl(array[index]);
        }
    }


    public ReturnObject remove(int index){
        if (array[index] == null){
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        } else {
            for (int i=index; i < arraySize; i++) {
                array[i] = array[i+1];
            }
            arraySize--;
            return new ReturnObjectImpl(array[index]);
        }
    }


    public ReturnObject add(int index, Object item) {
        if (item == null)  {
            return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
        } else if (index < 0 || index >= arraySize) {
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        } else{
            if (array.length == arraySize + 1) {
               //array maxed out
                Object[] tempArray = new Object[arraySize+setSize];
                for (int i=0; i<arraySize; i++) {
                    tempArray[i] = array[i];
                }
                array = tempArray;
            }
            for (int i = arraySize; i> index; i--) {
                array[i+1] = array[i];
            }
            array[index] = item;
            arraySize++;
            return new ReturnObjectImpl(array[index]);
        }
    }

    public ReturnObject add(Object item) {
        if (item == null) {
            return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
        } else {
            if (array.length == arraySize + 1) {
                //array maxed out
                Object[] tempArray = new Object[arraySize+setSize];
                for (int i=0; i<arraySize; i++) {
                    tempArray[i] = array[i];
                }
                array = tempArray;
            }
            array[arraySize] = item;
            arraySize++;
            return new ReturnObjectImpl(array[arraySize]);
        }
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
