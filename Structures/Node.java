package Structures;

/**
 * @author Ehshan Veerabangsa
 */
public class Node {

    private Object nodeValue;
    private Node next;


    /**
     * Node class constructor. A node with value and pointer set to null
     *
     * @param nodeValue the value of the node
     */
    public Node(Object nodeValue) {
        this.nodeValue = nodeValue;
        this.next = null;
    }

    /**
     * Gets the object included in the node
     *
     * @return will return the object
     */
    public Object getValue() {
        return nodeValue;
    }

    /**
     * Sets the value of object included in the node
     *
     * @param nodeValue the new value of the node
     */
    public void setValue(Object nodeValue) {
        this.nodeValue = nodeValue;
    }

    /**
     * Gets the next next node in the list
     *
     * @return will return the next node in the list
     */
    public Node getNext() {
        return next;
    }

    /**
     * Sets the next node in the list
     *
     * @param newNode the next node in the list
     */
    public void setNext(Node newNode) {
        next = newNode;
    }

}

