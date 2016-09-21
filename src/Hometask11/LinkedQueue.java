package Hometask11;//package Hometask11;
//
///**
// * Created by Admin on 06.09.2016.
// */
//public class LinkedQueue <T> implements Queue <T> {
//    private Node<T> first;
//    private Node<T> last;
//    private int size;
//
//    @Override
//    public T pushFirst(T elem) {
//        if(size == 0){
//            last = first = new Node<>(elem);
//        } else {
//            Node<T> nd = new Node<>(elem);
//            nd.prev = last;
//            last.next = nd;
//            last = nd;
//        }
//        size++;
//        return true;
//    }
//
//    @Override
//    public T pushLast(T elem) {
//        return false;
//    }
//
//    @Override
//    public T popFirst() {
//        if(size == 0) return null;
//        T tmp = first.value;
//        if(first == last){
//            first = last = null;
//        } else {
//            first = first.prev;
//            first.next = null;
//        }
//        size--;
//        return tmp;
//    }
//
//    @Override
//    public T popLast() {
//        return null;
//    }
//
//    @Override
//    public T takeFirst() {
//        return null;
//    }
//
//    @Override
//    public T takeLast() {
//        return null;
//    }
//
//    @Override
//    public int size() {
//        return size;
//    }
//
//    @Override
//    public boolean isEmpty() {
//        return false;
//    }
//}
