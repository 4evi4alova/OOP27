package collections.stack;

/**
 * Created by Admin on 28.09.2016.
 */
public interface Collection<E> {

    //Метод проверяющий коллекцию на наличие элементов
    boolean isEmpty();
    //Метод который возвращает количество элементов
    int size();
    //Метод проверяющий наличие элемента в коллекции
    boolean contains(E element);
    //Метод возвращающий позицию элемента в коллекции
    //@return -1  если элемент не найден
    int indexOf(E element);
    //Метод очищающий коллекцию
    void clear();
}
