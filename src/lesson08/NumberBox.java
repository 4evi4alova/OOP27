package lesson08;

/**
 * Created by Admin on 05.10.2016.
 */
public class NumberBox<T extends Number> {
    private T number;

    public NumberBox(T number) {
        this.number = number;
    }

    public void setNumber(T number) {
        this.number = number;
    }
}

