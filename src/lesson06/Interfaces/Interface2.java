package lesson06.Interfaces;

/**
 * Created by Admin on 23.09.2016.
 */
public interface Interface2 {
    int CONST = 200;

    void someMethod();

    default void defMethod() {
        System.out.println("GOOOO!...");
    }
}

