package lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;

/**
 * Created by Admin on 16.08.2016.
 */
public class SortOfCustomClasses {
    public static void main (String [] args){
        ArrayList<Person> persons = new ArrayList<>(Arrays.asList(
                new Person("Vasia", "Pupkin", 40),
        new Person("Vasia", "Pupkin", 40),
        new Person("Vasia", "Petrov", 20),
        new Person("Ivan", "Fedorov", 30),
        new Person("Fedor", "Ivanov", 30),
        new Person("Grisha", "Zubkov", 35),
        new Person("Misha", "Ivanov", 35),
        new Person("Ivan", "Oleynik", 25),
        new Person("Stas", "Govno", 20),
                ));
        Collections.sort(person, (p1,p2)-> p1.age - p2.age);
        Collections.sort(person, (p1,p2)->{
            if (p1.age != p2.age){
                return Integer.compare(  )
            }
        });
    }
}
class Person {
    String name;
    String surname;
    String age;

    public Person (String name, String surname, String age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    @Override
    public String toString (){
        return String.format("%s, %s, %d", name, surname, age);
    }

}