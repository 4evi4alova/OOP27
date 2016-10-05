package lesson06.Interfaces;

/**
 * Created by Admin on 23.09.2016.
 */
public class SedanCar extends BaseCar implements PassengersCar {
    @Override
    public void start() {
        System.out.println("Машина заведена");
    }

    @Override
    public void transportingPassengers() {
        System.out.println("Перевожу 4-х пассажиров ");
    }

    @Override
    public void drive(Integer mills) {
        System.out.println("Едем " + mills + "миль.");
    }

    @Override
    public void stop() {
        System.out.println("");

    }
}
