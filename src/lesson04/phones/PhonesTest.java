package lesson04.phones;

/**
 * Created by Admin on 18.09.2016.
 */
public class PhonesTest {
    public static void main(String[] args) {
        SimCard simCard = new SimCard();
        simCard.setBalance(25);
        System.out.println(simCard.getBalance());
        simCard.setBalance(-100);
        System.out.println(simCard.getBalance());

        ChinaNoName china = new ChinaNoName();
        china.about();
    }
}
