package lesson03.phones;

/**
 * Created by Admin on 18.09.2016.
 */
public class SimCard {
    private String operator;
    private Integer phone;
    private Integer balance;
    private Integer minCost;

    public SimCard(String operator, Integer phone) {
        this.operator = operator;
        this.phone = phone;
        balance = 0;
        minCost = 1;
    }

    public void about() {
        System.out.println(
                "Оператор : " + operator + "\n" +
                        "Тел.     : +38050" + phone    + "\n"
        );
    }

    public void setBalance(Integer balance) {
        this.balance += balance;
    }

    public Integer getBalance() {
        return balance;
    }
}

