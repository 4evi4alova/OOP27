package lesson06.Interfaces;

/**
 * Created by Admin on 23.09.2016.
 */
public interface Car {
//    Блок констант
    public static final Integer TANK = 50; // TANK - константы с caps lock

//    Блок методов
    public void start ();
    public void drive (Integer mills);
    void stop (); // public можно опускать
}
