package lesson03.phones;

import java.util.ArrayList;

/**
 * Created by Admin on 18.09.2016.
 */
public class Phone {
    private String model;
    private SimCard simCard;
    private ArrayList<Contact> contacts;

    public Phone(String model, SimCard simCard) {
        this.model = model;
        this.simCard = simCard;
        contacts = new ArrayList<>();
    }

    public void fillBalance(Integer money) {
        if (money > 0) {
            simCard.setBalance(money);
        }
    }

    public void checkBalance() {
        System.out.println("Баланс : " +simCard.getBalance());
    }

    public void newContact(String name, String surname, Integer phone) {
        contacts.add(new Contact(name, surname, phone));
    }

    public void about() {
        System.out.println("Модель : " + model);
    }
}

