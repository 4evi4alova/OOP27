package lesson12;

import javax.xml.soap.Node;

/**
 * Created by Admin on 01.09.2016.
 */
public class LinkedDeque <T> implements Deque <T>{

    private Node<T> first;
    private Node<T> last;
    private int size;

    @Override
    public T pushFirst(T elem) {
        if(size == 0){
            last = first = new Node<>(elem);
        } else {
            Node<T> nd = new Node<>(elem);
            nd.prev = first;
            first.next = nd;
            first = nd;
        }
        size++;
        return true;
    }

    @Override
    public T pushLast(T elem) {
        return false;
    }

    @Override
    public T popFirst() {
        if(size == 0) return null;
        T tmp = first.value;
        if(first == last){
            first = last = null;
        } else {
            first = first.prev;
            first.next = null;
        }
        size--;
        return tmp;
    }

    @Override
    public T popLast() {
        return null;
    }

    @Override
    public T takeFirst() {
        return null;
    }

    @Override
    public T takeLast() {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }


    public void forEachFirst(Consumer<T> cons){
        cons.accept(first.value);
    }

    public void forEachLast(Consumer<Integer> cons){

    }

    //*
    public Deque map(Function<Integer, Integer> mapper){
        return null;
    }



    @Override
    public String toString() {
        if(size == 0)return "[]";

        StringBuilder sb = new StringBuilder("[");

        for(Node nd = first; nd != null; nd = nd.prev){
            sb.append(nd.value);
            if(nd.prev != null){
                sb.append(", ");
            } else {
                sb.append("]");
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        LinkedDeque deque = new LinkedDeque();

        deque.pushFirst(3);
        deque.pushFirst(1);
        deque.pushFirst(5);
        deque.pushFirst(7);
        deque.pushFirst(2);
        deque.pushFirst(4);

        Deque result = deque.map((e) -> (int)Math.pow(e, 2));



        deque.forEachFirst(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });


    }

    //inner class
//    class Node2{
//
//    }

    //nested class
    private static class Node <V>{
        Node<V> next;
        Node<V> prev;
        V value;

        public Node(V value) {
            this.value = value;
        }

        public Node(Node<V> next, Node<V> prev, V value) {
            this.next = next;
            this.prev = prev;
            this.value = value;
        }
    }
}