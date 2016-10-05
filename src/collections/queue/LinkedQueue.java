package collections.queue;

/**
 * Created by Admin on 05.10.2016.
 */
public class LinkedQueue<E> implements Queue<E> {

    private class Node<E> {

        private E element;
        private Node next;

        public Node(E element) {
            this.element = element;
        }
    }

    private Node head;
    private Node tail;

    private int size;

    public LinkedQueue() {
        size = 0;
    }

    public boolean offer(E element) {
        Node nd = new Node(element);
        if (head == null) {
            head = tail = nd;
        } else {
            tail.next = nd;
            tail = nd;
        }
        size++;
        return true;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public E poll() {
        E element = (E) head.element;
        head = head.next;
        size--;
        return element;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(E element) {
        Node current = head;
        while (current != null) {
            if (current.element == element) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public int indexOf(E element) {
        Node current = head; int counter = 0;
        while (current != null) {
            if (current.element == element) {
                return counter;
            }
            current = current.next; counter++;
        }
        return -1;
    }

    @Override
    public void clear() {
        head = tail = null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Первый -> {" + head.element+ "} [");
        Node current = head;
        while (current != null) {
            builder.append(
                    current.next != null ? current.element + ", " : current.element);
            current = current.next;
        }
        builder.append("] {" + tail.element + "} <- Последний");
        return builder.toString();
    }
}
