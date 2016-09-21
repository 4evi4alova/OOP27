package lesson8;

import lesson6.Car;

/**
 * Created by Admin on 09.08.2016.
 */
public class Truck extends Car {
    public Truck(String model, double fuelConsumption, int mtc, int payLoad) {
        /*
        если нет конструктора по умолчанию
        в родительском классе
        и можно добавить, что-то свое типа payLoad
        */
        super(model, fuelConsumption, mtc);
//        this.payLoad = payLoad;
    }
}

