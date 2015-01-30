/**
 * @author Ehshan Veerabangsa
 */
public class ArrayList implements List {
    private Object[] array;
    private int arraySize;
    private static int defaultSize = 11;

    public ArrayList() {
        array = new Object[defaultSize];
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
            //array maxed out, needs extending
            if (array.length == arraySize + 1) {
                arrayExtender();
            }
            for (int i = arraySize; i> index; i--) {
                array[i+1] = array[i];
            }
            array[index] = item;
            arraySize++;
            return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
        }
    }

    public ReturnObject add(Object item) {
        if (item == null) {
            return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
        } else {
            //array maxed out, needs extending
            if (array.length == arraySize + 1) {
                arrayExtender();
            }
            array[arraySize] = item;
            arraySize++;
            return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
        }
    }
    /**
     *Takes the array and extends it by size of 11
     *
     *@return the extended array
     */
    public void arrayExtender() {
        Object[] tempArray = new Object[arraySize+defaultSize];
        for (int i=0; i<arraySize; i++) {
            tempArray[i] = array[i];
        }
        array = tempArray;
    }
}

