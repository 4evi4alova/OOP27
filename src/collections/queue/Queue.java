package collections.queue;

import collections.stack.Collection;

/**
 * Created by Admin on 05.10.2016.
 */
public interface Queue<E> extends Collection<E> {

    public boolean offer(E element);

    E peek();

    E poll();

}
