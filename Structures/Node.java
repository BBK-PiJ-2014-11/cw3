package structures;

/**
 * Created by Ehshan
 */
public class Node {

    private Object nodeValue;
    private Node next;
    private int index;

    public Node(Object nodeValue) {
        this.nodeValue = nodeValue;
        this.next = null;
        this.index = index;
    }

    public Object getValue() {
        return nodeValue;
    }

    public void setValue(Object NodeValue) {
        this.nodeValue = NodeValue;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node newNode) {
        next = newNode;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(){
        this.index = index;
    }
}

