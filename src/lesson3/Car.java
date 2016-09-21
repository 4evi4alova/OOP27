package lesson3;

/**
 * Created by Admin on 14.09.2016.
 */
public class Car {
    private String model; // переменные лучше объявлять private or protect
    private String color;
    private Integer year;


//    public Car (String model){
//        this.model = model;
//        this.color = "black"; // const значения
//        year = 1998;   // какую бы модель не создали  на этом этапе цвет и год будут такими
//    }
    public Car (String model, String color, Integer year) {
        this.model = model;
        this.color = color; // этот конструктор уже на модель и цвет
        this.year = year;
    }
        public Car (String model, String color) {
            this(model, color, 2002);
        }
    public Car (String model) {
        this(model, "Black");
    }
    public Car (){
        model = "Hundai";
        color = "Black";
        year = 1988;
}
public void printAbout (){
System.out.println(
        "Mодель : " + model + "\n" +
        "Цвет : " + color + "\n" +
        "Год : " + year + "\n"
);
}
}
