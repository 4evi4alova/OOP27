package lesson06.Interfaces;

/**
 * Created by Admin on 23.09.2016.
 */
public class SomeTest implements Interface1, Interface2 {
    @Override
    public void someMethod() {
        System.out.println("Some");
        System.out.println(Interface1.CONST);
    }

    @Override
    public void defMethod() {
        System.out.println("Def");
        System.out.println(Interface2.CONST);
    }
}

