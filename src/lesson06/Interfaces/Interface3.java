package lesson06.Interfaces;

/**
 * Created by Admin on 23.09.2016.
 */
public interface Interface3 extends Interface1, Interface2{
    @Override
    default void defMethod() {
        System.out.println("FFFFOOOO");
    }
}

