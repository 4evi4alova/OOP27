package Hometask11;

/**
 * Created by Admin on 22.08.2016.
 */
public interface Queue <T> {
    boolean push(int element);
    T pop();
    T take();
    int size();
    boolean isEmpty();
}
