package lesson06.Interfaces;

/**
 * Created by Admin on 23.09.2016.
 */
// Класс реализации интерфейса
public class BaseCar implements Car {
    @Override
    public void start() {
        System.out.println("Start...");
    }

    @Override
    public void drive(Integer mills) {
        System.out.println("Driving..." + mills);
    }

    @Override
    public void stop() {
        System.out.println("Stop...");
    }
//    public void tankVolume ();
//    System.out.println("TANK = " + TANK);
//}
}