/**
 *{@inheritDoc}
 *
 *@author Ehshan Veerabangsa
 */
public class ArrayList implements List {
    private Object[] array;
    private int arraySize;
    private static int defaultSize = 11;

    /**
     *ArrayList class constructor
     *
     *Creates an empty array list
     */
    public ArrayList() {
        array = new Object[defaultSize];
        arraySize = 0;
    }

    /**
     *{@inheritDoc}
     */
    @Override
    public boolean isEmpty() {
        if (arraySize == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     *{@inheritDoc}
     */
    @Override
    public int size(){
        return arraySize;
    }

    /**
     *{@inheritDoc}
     */
    @Override
    public ReturnObject get(int index) {
        ReturnObject errorObject;
        errorObject = indexChecker(index);
        if (errorObject.hasError()){
            return errorObject;
        }else{
            return new ReturnObjectImpl(array[index]);
        }
    }

    /**
     *{@inheritDoc}
     */
    @Override
    public ReturnObject remove(int index){
        ReturnObject errorObject;
        errorObject = indexChecker(index);
        if (errorObject.hasError()){
            return errorObject;
        }else{
            indicesDown(index);
            arraySize--;
            return new ReturnObjectImpl(array[index]);
        }
    }

    /**
     *{@inheritDoc}
     */
    @Override
    public ReturnObject add(int index, Object item) {
        ReturnObject errorObject;
        errorObject = indexChecker(index);
        if (errorObject.hasError()){
            return errorObject;
        }else if(item == null)  {
            return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
        }else{
            //array maxed out, needs extending
            if (arrayMax()) {
                arrayExtender();
            }
            indicesUp(index);
            array[index] = item;
            arraySize++;
            return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
        }
    }

    /**
     *{@inheritDoc}
     */
    @Override
    public ReturnObject add(Object item) {
        if (item == null)  {
            return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
        }else{
            //array maxed out, needs extending
            if (arrayMax()) {
                arrayExtender();
            }
            array[arraySize] = item;
            arraySize++;
            return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
        }
    }

    /**
     *Checks if the array is at full capacity
     *
     *@return true or false
     */
    public boolean arrayMax() {
        if (array.length == arraySize + 1) {
            return true;
        }else{
            return false;
        }
    }

    /**
     *Takes the array and extends it by size of 11
     */
    public void arrayExtender() {
        Object[] tempArray = new Object[arraySize+defaultSize];
        for (int i=0; i<arraySize; i++) {
            tempArray[i] = array[i];
        }
        array = tempArray;
    }

    /**
     *Takes the index value of object in list and returns an appropriate error object
     *
     *@param index of object being referenced
     *
     *@return An object containing a error message
     */
    private ReturnObject indexChecker(int index){
        if (isEmpty()) {
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        } else if(index < 0 || index > arraySize -1){
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        }else{
            return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
        }
    }

    /**
     *Increases the index position of all stored objects after the added object
     *
     *@param index of object being referenced
     */
    public void indicesUp(int index) {
        for (int i = arraySize; i>= index; i--) {
            array[i+1] = array[i];
        }
    }

    /**
     *Decreases the index position of all stored objects after the removed object
     *
     *@param index of object being referenced
     */
    public void indicesDown(int index) {
        for (int i = index; i < arraySize; i++) {
            array[i] = array[i+1];
        }
    }

}

