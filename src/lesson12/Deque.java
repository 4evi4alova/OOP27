package lesson12;

/**
 * Created by Admin on 01.09.2016.
 */
public interface Deque <T>{

    boolean pushFirst(T elem);
    boolean pushLast(T elem);

    T popFirst();
    T popLast();

    T takeFirst();
    T takeLast();

    int size();

    boolean isEmpty();


}
