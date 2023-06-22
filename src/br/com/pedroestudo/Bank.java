package br.com.pedroestudo;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private double creditLimit;
    private double buyValue;
    private List<Buy> buys;

    public Bank(double creditLimit) {
        this.creditLimit = creditLimit;
        this.buyValue = creditLimit;
        this.buys = new ArrayList<>();
    }

    public boolean buyed (Buy buy) {
        if (this.buyValue > buy.getValue()) {
            this.buyValue -= buy.getValue();
            this.buys.add(buy);
            return true;
        }
        return false;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public double getBuyValue() {
        return buyValue;
    }

    public List<Buy> getBuys() {
        return buys;
    }
}
