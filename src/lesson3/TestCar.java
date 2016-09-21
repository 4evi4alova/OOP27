package lesson3;

/**
 * Created by Admin on 14.09.2016.
 */
public class TestCar {
    public static void main(String[] args) {
        Car car = new Car ();
        Car car2 = new Car ("Ваз");
        Car car3 = new Car ("Ford" , "Silver-metalic");

        car.printAbout();
        car2.printAbout();
        car3.printAbout();
    }
}
