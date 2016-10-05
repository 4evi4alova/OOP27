package collections.stack;


/**
 * Created by Admin on 28.09.2016.
 */
public interface Stack<E> extends Collection<E> {

    //Добавление элемента в стек
    void push(E element);

    //Извлечение элемента из стека
    E pop();

}
