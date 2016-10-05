package lesson08;

/**
 * Created by Admin on 05.10.2016.
 */
public class GenericsTest {

    public static void main(String[] args) {
        Container<Integer> number = new Container<>(100);
        Container<String> string = new Container<>("Hello");

        System.out.println(number.getObject());
        System.out.println(string.getObject());

        Container object1 = new Container((byte)1345F);
        object1.getObjectType();
        Container object2 = new Container("test");
        object2.getObjectType();
        Container object3 = new Container('d');
        object3.getObjectType();

        Object obj = object1.getObject();
        System.out.println(obj);
    }
}
