package lesson10;

/**
 * Created by Admin on 16.08.2016.
 */
public class Person {
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