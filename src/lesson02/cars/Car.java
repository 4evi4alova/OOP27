package lesson02.cars;

/**
 * Created by Admin on 18.09.2016.
 */
public class Car {
    //Парметры (аргументы, атрибуты)
    public String model;    //Параметр отвечающий за модель
    public String color;    //Параметр отвечающий за цвет
    public Integer millage; //Параметр отвечающий за пробег
    public Boolean status;  //Параметр отвечающий за заведен
    public Integer tank;    //Параметр отвечающий за количество топлива

    //Методы (Блок обработки, доступа к данным)
    public void start() {
        if (!status) {
            status = true;
            System.out.println("Машина заведена...");
        }
    }

    public void drive(Integer mills) {
        if (status == true) {
            for (int i = mills;
                 i > 0 & tank > 0 & status;
                 i -= 10, tank--,  millage += 10);
        }
    }

    public void stop() {
        if (status) {
            status = false;
            System.out.println("Машина заглушена...");
        }
    }

}

