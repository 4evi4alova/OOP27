package HometaskFirm;

/**
 * Created by Admin on 21.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        Firm f = new Firm("qqqq", "qqqqq", 0);

        Console c = new Console(f);


        c.start();
    }
}