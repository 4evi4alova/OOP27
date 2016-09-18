package lesson04.phones;

/**
 * Created by Admin on 18.09.2016.
 */
public class SimCard {
    public Integer balance;

    public SimCard() {
        balance = 0;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        if (balance > 0) {
            this.balance += balance;
        }
    }
}

