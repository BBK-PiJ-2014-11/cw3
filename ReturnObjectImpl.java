/**
 * Implementation of ReturnObject. Returns either an object or an error
 */
public class ReturnObjectImpl implements ReturnObject {
    private Object returnObject;
    private ErrorMessage error;

    public ReturnObjectImpl(Object returnObject) {
        this.returnObject = returnObject;
        this.error = ErrorMessage.NO_ERROR;
    }

    public ReturnObjectImpl(ErrorMessage error) {
        this.returnObject = null;
        this.error = error;
    }

    public boolean hasError() {
        if (error != ErrorMessage.NO_ERROR){
            return true;
        } else {
            return false;
        }
    }

    public ErrorMessage getError() {
        if (hasError()) {
            return error;
        } else {
            return ErrorMessage.NO_ERROR;
        }
    }

    public Object getReturnValue() {
        if (hasError()) {
            return error;
        } else {
            return returnObject;
        }
    }
}
