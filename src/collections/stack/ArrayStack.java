package collections.stack;

/**
 * Created by Admin on 28.09.2016.
 */
public class ArrayStack<E> implements Stack<E> {

    private E[] arr;
    private int size;

    public ArrayStack() {
        arr = (E[]) new Object[10];
        size = 0;
    }

    public ArrayStack(int size) {
        arr = (E[]) new Object[size];
        this.size = 0;
    }

    @Override
    public void push(E element) {
        if (size == arr.length) {
            arr = newArray(arr);
        }
        arr[size++] = element;
    }

    @Override
    public E pop() {
        return arr[--size];
    }

    @Override
    public boolean isEmpty() {
        //Тенарный оператор (Элвис)
        //return size == 0 ? true : false;
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(E element) {
        for (E elem : arr) {
            if (elem == element) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (element == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < size; i++) {
            builder.append(i < size - 1 ? arr[i] + ", " : arr[i]);
        }
        builder.append("]");
        return builder.toString();
    }

    private E[] newArray(E[] old) {
        E[] newarr = (E[]) new Object[old.length * 2];
        System.arraycopy(old, 0, newarr, 0, old.length);
        return newarr;
    }

}
