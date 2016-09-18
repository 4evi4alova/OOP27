package lesson03.phones;

/**
 * Created by Admin on 18.09.2016.
 */
public class PhoneTest {
    public static void main(String[] args) {
        SimCard sim = new SimCard("Vodafone", 1234567);
        sim.about();

        Phone phone = new Phone("Blackberry", sim);
        phone.about();
        phone.fillBalance(20);
        phone.checkBalance();
        phone.fillBalance(-15);
        phone.checkBalance();
        phone.fillBalance(20);
        phone.checkBalance();

        phone.newContact("test1", "test1", 9875463);
        phone.newContact("test2", "test2", 1256845);
        phone.newContact("test3", "test3", 9965485);


    }
}

