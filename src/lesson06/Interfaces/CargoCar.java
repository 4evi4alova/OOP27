package lesson06.Interfaces;

/**
 * Created by Admin on 23.09.2016.
 */
public interface CargoCar extends Car {
//    Default - реализация поддерживается начиная с Java 1.8
    default void transportingCargo (){
        System.out.println("Перевожу груз...");
    }

}
