package collections.deque;

import collections.queue.Queue;
import collections.stack.Stack;

/**
 * Created by Admin on 05.10.2016.
 */
public interface Deque<E> extends Queue<E>, Stack<E> {
    /**Добавляет элемент в конец очереди,
     * @return true  - элемент удачно добавлен
     *         false - элемент не добавлен*/
    public boolean offer(E element);

    /**Возвращает без удаления элемент из начала очереди
     * @return int element - возврщает значение элемента
     *             null    - если очередь пуста, возвращается null*/
    public E peek();

    /**Возвращает c удалением элемент из начала очереди
     * @return int element - возврщает значение элемента
     *             null    - если очередь пуста, возвращается null*/
    public E poll();

    /**Добавляет элемент в начало очереди*/
    public void addFirst(E element);

    /**Добавляет элемент в конец очереди*/
    public void addLast(E element);

    /**Добавляет элемент в начало очереди
     * @return true  - элемент удачно добавлен
     *         false - элемент не добавлен*/
    public boolean offerFirst(E element);

    /**Добавляет элемент в конец очереди
     * @return true  - элемент удачно добавлен
     *         false - элемент не добавлен*/
    public boolean offerLast(E element);

    /**Возвращает без удаления элемент из начала очереди
     * @return int element - возврщает значение элемента
     *             null    - если очередь пуста, возвращается null*/
    public E peekFirst();

    /**Возвращает без удаления элемент из конца очереди
     * @return int element - возврщает значение элемента
     *             null    - если очередь пуста, возвращается null*/
    public E peekLast();

    /**Возвращает c удалением элемент из начала очереди
     * @return int element - возврщает значение элемента
     *             null    - если очередь пуста, возвращается null*/
    public E pollFirst();

    /**Возвращает c удалением элемент из конца очереди
     * @return int element - возврщает значение элемента
     *             null    - если очередь пуста, возвращается null*/
    public E pollLast();

    public int lastIndexOf(E element);
}
