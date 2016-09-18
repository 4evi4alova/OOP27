package lesson04.phones;

/**
 * Created by Admin on 18.09.2016.
 */
public class Phone {
    private String model;
    private SimCard sim;

    public Phone() {
        model = "NoName";
        sim = null;
    }

    public void about() {
        System.out.println("Модель : " + model);
    }

    public String getModel() {
        return model;
    }

    public SimCard getSim() {
        return sim;
    }
}

