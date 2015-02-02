package Structures;

/**
 * {@inheritDoc}
 *
 * @author Ehshan Veerabangsa
 */
public class ReturnObjectImpl implements ReturnObject {

    private Object returnObject;
    private ErrorMessage error;


    /**
     * ReturnObjectImpl class constructor. An object will be returned if the operation was successful
     *
     * @param returnObject
     */
    public ReturnObjectImpl(Object returnObject) {
        this.returnObject = returnObject;
        this.error = ErrorMessage.NO_ERROR;
    }

    /**
     * ReturnObjectImpl class constructor. An error message will be returned if the operation was unsuccessful
     *
     * @param error a pre defined error message
     */
    public ReturnObjectImpl(ErrorMessage error) {
        this.returnObject = null;
        this.error = error;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean hasError() {
        if (error != ErrorMessage.NO_ERROR){
            return true;
        } else {
            return false;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ErrorMessage getError() {
        if (hasError()) {
            return error;
        } else {
            return ErrorMessage.NO_ERROR;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getReturnValue() {
        if (hasError()) {
            return error;
        } else {
            return returnObject;
        }
    }
}
