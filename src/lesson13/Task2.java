package lesson13;

import java.util.ArrayList;

/**
 * Created by Admin on 06.09.2016.
 */
public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> list =  new ArrayList<>();
        list.add("jmhvm");
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.set(0,"new"));
        System.out.println(list);
        ArrayList<String> clone = new ArrayList<>(list);

        list.clear();
        System.out.println(list.remove(0  ));
        System.out.println(list);
    }
}
