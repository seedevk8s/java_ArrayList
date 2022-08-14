package kr.ac.ezenac.list;

public class MyLinkedList<T> implements IList<T> {

    private int size;
    private Node head;

    public MyLinkedList() {
        this.size = 0;
        this.head = new Node(null);         // dummy head node
    }

    private class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
        }

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    @Override
    public void add(T t) {
        Node current = this.head;
        while (current.next != null) {
            current = current.next;
        }
        Node n = new Node(t);
        current.next = n;
        this.size++;
    }

    @Override
    public void insert(int index, T t) {
        if (index > this.size || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        Node prev = this.head;
        Node current = prev.next;

        int i = 0;
        while (i++ < index) {
            prev = prev.next;
            current = current.next;
        }

        Node newNode = new Node(t, current);
        prev.next = newNode;
        this.size++;
    }

    @Override
    public void clear() {
        this.size = 0;
        this.head.next = null;
    }

    @Override
    public boolean delete(Object o) {
        return false;
    }

    @Override
    public boolean deleteByIndex(int index) {
        return false;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
