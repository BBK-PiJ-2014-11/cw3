/**
 * Created by Ehshan
 */
public class Node {

    private Object NodeValue;
    private Node next;

    public Node(Object NodeValue) {
        this.NodeValue = NodeValue;
        next = null;
    }

    public Object getValue() {
        return NodeValue;
    }

    public void setValue(Object NodeValue) {
        this.NodeValue = NodeValue;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node newNode) {
        next = newNode;
    }
}

