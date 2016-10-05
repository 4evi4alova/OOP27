package collections.deque;

import collections.queue.LinkedQueue;

/**
 * Created by Admin on 05.10.2016.
 */
public class LinkedDeque<E> implements Deque<E> {

    private class Node<E> {
        private E element;

        private Node<E> next;
        private Node<E> prev;

        private Node(E element) {
            this.element = element;
        }
    }

    private Node<E> head;
    private Node<E> tail;

    private int size;

    public LinkedDeque() {
        size = 0;
    }

    /****************** STACK ************************/
    @Override
    public void push(E element) {

    }

    @Override
    public E pop() {
        return null;
    }
    /****************** STACK ************************/

    /****************** QUEUE ************************/
    @Override
    public boolean offer(E element) {
        return false;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public E poll() {
        return null;
    }
    /****************** QUEUE ************************/

    /****************** DEQUE ************************/
    @Override
    public void addFirst(E element) {
        Node<E> nd = new Node<>(element);
        if (head == null) {
            head = tail = nd;
        } else {
            //Первым шагом - делаем добавляемый элемент
            //предыдущим для головы очереди
            head.prev = nd;
            //Вторым шагом - делаем текущую голову очереди
            //следующей за добавленным элементом
            nd.next = head;
            //Третьим шагом - делаем добавленный элемент
            //головой очереди
            head = nd;
        }
        size++;
    }

    @Override
    public void addLast(E element) {
        Node<E> nd = new Node<>(element);
        if (tail == null) {
            head = tail = nd;
        } else {
            tail.next = nd;
            nd.prev = tail;
            tail = nd;
        }
        size++;
    }

    @Override
    public boolean offerFirst(E element) {
        addFirst(element);
        return true;
    }

    @Override
    public boolean offerLast(E element) {
        addLast(element);
        return true;
    }

    @Override
    public E peekFirst() {
        return head.element;
    }

    @Override
    public E peekLast() {
        return tail.element;
    }

    @Override
    public E pollFirst() {
        E element = head.element;
        head.next.prev = null;
        head = head.next; size--;
        return element;
    }

    @Override
    public E pollLast() {
        E element = tail.element;
        tail.prev.next = null;
        tail = tail.prev; size--;
        return element;
    }
    /****************** DEQUE ************************/

    /****************** ОБЩИЕ ************************/
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
    public int lastIndexOf(E element) {
        Node current = tail; int counter = 0;
        while (current != null) {
            if (current.element == element) {
                return counter;
            }
            current = current.prev; counter++;
        }
        return -1;
    }

    @Override
    public void clear() {

    }
    /****************** ОБЩИЕ ************************/

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

    public String toLastString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Первый -> {" + tail.element+ "} [");
        Node current = tail;
        while (current != null) {
            builder.append(
                    current.prev != null ? current.element + ", " : current.element);
            current = current.prev;
        }
        builder.append("] {" + head.element + "} <- Последний");
        return builder.toString();
    }
}
