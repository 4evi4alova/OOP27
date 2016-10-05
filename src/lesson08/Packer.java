package lesson08;

/**
 * Created by Admin on 05.10.2016.
 */
public class Packer<T> {

    public Container packing(T value) {
        return new Container(value);
    }

    public NumberBox packingNumbers(Number value) {
        return new NumberBox(value);
    }

//    public Container<T> packingNumbers(Container<?> container, T value) {
//        return container.setObject(value);
//    }

    public Object getValue(Container<?> container) {
        return container.getObject();
    }
}
