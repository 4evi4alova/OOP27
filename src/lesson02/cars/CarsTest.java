package lesson02.cars;

/**
 * Created by Admin on 18.09.2016.
 */
public class CarsTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.model = "ВАЗ 2101";
        car.color = "Черный";
        car.tank = 5;
        car.status = false;
        car.millage = 0;

        car.start();
        car.drive(30);
        System.out.println(car.millage);
        car.drive(40);
        System.out.println(car.millage);
        car.stop();
    }
}
