package collections.stack;


import collections.deque.LinkedDeque;
import collections.queue.LinkedQueue;
import collections.queue.Queue;

/**
 * Created by Admin on 28.09.2016.
 */
public class CollectionsTest {

    public static void main(String[] args) {
        LinkedDeque<Integer> deque = new LinkedDeque<>();

        deque.addLast(10);
        deque.addLast(20);
        deque.addLast(30);
        deque.addLast(40);
        deque.addLast(50);
        deque.addLast(50);
        deque.addLast(60);
        deque.addLast(70);
        deque.addLast(60);
        deque.addLast(80);
        deque.addLast(90);
        deque.addLast(100);

        System.out.println(deque);
        System.out.println("Кол-во шагов до элемента 60 с начала очереди: " + deque.indexOf(60));
        System.out.println("Кол-во шагов до элемента 60 с конца очереди: " + deque.lastIndexOf(60));

        System.out.println(deque);
        System.out.println(deque.pollFirst());
        System.out.println(deque);
        System.out.println(deque.toLastString());
        System.out.println(deque.pollLast());
        System.out.println(deque);
        System.out.println(deque.toLastString());
    }
}
