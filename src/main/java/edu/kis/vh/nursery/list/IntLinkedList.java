package edu.kis.vh.nursery.list;

public class IntLinkedList {

    public static final int EMPTY_LIST_VALUE = -1;
    private Node last;
    private int i;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            Node newNode = new Node(i);
            last.setNext(newNode);
            newNode.setPrev(last);
            last = newNode;
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return EMPTY_LIST_VALUE;
        return last.value;
    }

    public int pop() {
        if (isEmpty())
            return EMPTY_LIST_VALUE;
        int ret = last.value;
        last = last.getPrev();
        return ret;
    }

}