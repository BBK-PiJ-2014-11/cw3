/**
 * Created by Ehshan
*/
public class LinkedList implements List {

    private Node head;

    public LinkedList() {
        head = null;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        int size = 0;
        Node counter = head;
        while (counter!= null) {
            size++;
            counter= counter.getNext();
        }
        return size;
    }



    public ReturnObject get(int index){

        if (isEmpty()) {
            return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
        }else if (index < 0 || index >= size()) {
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        } else {
            Node current = head;
            for (int i=0; i<index; i++) {
                current = current.getNext();
            }

            ReturnObject object = new ReturnObjectImpl(current.getValue());//test thoroughly
            return object;
        }
    }


    public ReturnObject remove(int index){
        ReturnObject removedObject = get(index);
        if (index < 0 || index >= size()) {
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        }else if(index ==0) {
            head = head.getNext();
        }else{
            Node current = head;
            while (current!= null){
                Node previous = head;
                for(int i=1; i<index; i++) {
                    previous = previous.getNext();
                }
                //return new ReturnObjectImpl(current.getValue());
                previous.setNext(previous.getNext().getNext());// test test test
            }
        }
        return removedObject;
    }



    public ReturnObject add(int index, Object item){

        if (item == null) {
            return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
        } else if (index < 0 || index >= size()) {
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        }else {
            // check below
            Node current = head;
            for (int i = 1; i < index && current.getNext() != null; i++) {
                current = current.getNext();
            }

        }
        return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
    }

    public ReturnObject add(Object item){
        //Node count = new Node(item);
        if (item == null) {
            return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
        }
        // below working
        Node currentNode = new Node(item);
        if (isEmpty()) {
            head = currentNode ;
        }else{
            Node lastNode = head;
            while(lastNode.getNext()!=null) {
                lastNode = lastNode.getNext();
            }
            lastNode.setNext(currentNode);
        }
        return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
    }

    //printing methods for debugging
    public void printOut(Node item) {
        if (item != null) {
            System.out.println(item.getValue());
        }else{
            System.out.println("no item here");
        }
    }

    public void print() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        } else {
            Node currentNode = head;
            while (currentNode.getNext() != null) {
                printOut(currentNode);
                currentNode = currentNode.getNext();
            }
            printOut(currentNode);
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
