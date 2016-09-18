package lesson03;

/**
 * Created by Admin on 18.09.2016.
 */
public class Car {
    private String model;
    private String color;
    private Integer year;

    public Car() {
        model = "Hundai";
        color = "Черный";
        year = 1998;
    }

    public Car(String model) {
        this();
        this.model = model;
    }

    public Car(String model, String color) {
        this();
        this.model = model;
        this.color = color;
    }

    public Car(String model, String color, Integer year) {
        this();
        this.model = model;
        this.color = color;
        this.year = year;
    }


    public void printAbout() {
        System.out.println(
                "Модель : " + model + "\n" +
                        "Цвет   : " + color + "\n" +
                        "Год    : " + year  + "\n"
        );
    }
}
