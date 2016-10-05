package collections;

import collections.stack.Stack;

/**
 * Created by Admin on 28.09.2016.
 */
public class LinkedStack<E> implements Stack<E> {

    private class Node<E> {
        private E element;
        private Node next;

        public Node(E element) {
            this.element = element;
        }

        public Node(E element, Node next) {
            this.element = element;
            this.next = next;
        }
    }

    private Node head;
    private int size;

    public LinkedStack() {
        size = 0;
    }

    @Override
    public void push(E element) {
        /*Node nd = new Node(element);
        if (head == null) {
            head = nd;
        } else {
            nd.next = head;
            head = nd;
        }*/
        Node<E> nd = new Node<E>(element, head);
        head = nd;
        size++;
    }

    @Override
    public E pop() {
        Node<E> current = head;
        head = head.next;
        return current.element;
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
        Node curent = head;
        while (curent != null) {
            if (curent.element == element) {
                return true;
            }
            curent = curent.next;
        }
        return false;
    }

    @Override
    public int indexOf(E element) {
        Node curent = head; int counter = 0;
        while (curent != null) {
            if (curent.element == element) {
                return counter;
            }
            curent = curent.next; counter++;
        }
        return -1;
    }

    @Override
    public void clear() {
        head = null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        Node current = head;
        while (current != null) {
            builder.append(current.next != null ? current.element + ", " : current.element);
            current = current.next;
        }
        builder.append("]");
        return builder.toString();
    }
}
