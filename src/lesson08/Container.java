package lesson08;

/**
 * Created by Admin on 05.10.2016.
 */
public class Container<T> {

    private T object;

    public Container(T object) {
        this.object = object;
    }


    public void setObject(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void getObjectType() {
        System.out.println("Тип объекта :" + object.getClass().getName());
    }
}

