package lesson06.Interfaces;

/**
 * Created by Admin on 23.09.2016.
 */
public class InterTest {
    public static void main(String[] args) {
        PickupCar sedanCar = new PickupCar();
        sedanCar.start();
        sedanCar.drive(50);
        sedanCar.transportingPassengers();
        sedanCar.transportingCargo();
        sedanCar.stop();

        Interface1 test = new SomeTest();
        System.out.println(test.CONST);
        System.out.println(((Interface2) test).CONST);
    }
}
