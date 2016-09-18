package lesson03.phones;

/**
 * Created by Admin on 18.09.2016.
 */
public class Contact {
    private String name;
    private String surname;
    private Integer phone;

    public Contact(String name, String surname, Integer phone) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    public void about() {
        System.out.println(
                "ФИО :        " + name + " " + surname + "\n" +
                        "Тел. : +38050" + phone
        );
    }
}

