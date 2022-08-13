package kr.ac.ezenac.list;

public class MyLinkedList<T> implements IList {

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
    public void add(Object o) {

    }

    @Override
    public void insert(int index, Object o) {

    }

    @Override
    public void clear() {

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
    public Object get(int index) {
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
