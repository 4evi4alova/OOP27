package lesson04.phones;

/**
 * Created by Admin on 18.09.2016.
 */
public class Smartphone extends Phone {
    private String os;

    public Smartphone() {
        this.os = "iDroid";
    }

    @Override
    public void about() {
        //super.about();
        System.out.println(
                "Модель : " + getModel() + "\n" +
                        "ОС : " + os
        );
    }
}

