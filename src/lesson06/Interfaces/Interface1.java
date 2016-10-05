package lesson06.Interfaces;

/**
 * Created by Admin on 23.09.2016.
 */
public interface Interface1 {

    int CONST = 100;

    void someMethod();

    default void defMethod() {
        System.out.println("Foo...");
    }
}
