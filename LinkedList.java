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
            Node currentNode = head;
            for (int i=0; i<index; i++) {
                currentNode = currentNode.getNext();
            }
            ReturnObject object = new ReturnObjectImpl(currentNode.getValue());//test thoroughly
            return object;
        }
    }


    public ReturnObject remove(int index){
        ReturnObject removedObject = get(index);
        if (index < 0 || index >= size()) {
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        }else if(index == 0) {
            head = head.getNext();
        }else{
            Node currentNode = head;
                for(int i=1; i < index; i++) {
                    currentNode = currentNode.getNext();
                }
            currentNode.setNext(currentNode.getNext().getNext());
            }
        return removedObject;
    }


    public ReturnObject add(int index, Object item){
        Node currentNode = head;
        Node addNode = new Node(item);
        if (item == null) {
            return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
        } else if (index < 0 || index >= size()) {
            return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
        }else if (index != 0 ) {
            for (int i = 1; i<index; i++) {
                currentNode = currentNode.getNext();
            }
            addNode.setNext(currentNode.getNext());
            currentNode.setNext(addNode);
        }else{
            addNode.setNext(head);
            head = addNode;
        }
        return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
    }

    public ReturnObject add(Object item){
        if (item == null) {
            return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
        }
        Node addNode = new Node(item);
        if (isEmpty()) {
            head = addNode;
        }else{
            Node currentNode = head;
            while(currentNode.getNext()!=null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(addNode);
        }
        return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
    }
    /**
     * Print out methods for manual tests
     */
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

