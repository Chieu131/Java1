package com.class2;

public class Wallet {
    int amount = 0;

    public Wallet(int money) {
        System.out.println("Setting money to wallet " + money);
        this.amount = money;
    }

    public int getAmount() {
        return this.amount;
    }

    public void deposit(int money) {
        this.amount += money;
    }

    public boolean pay(int money) {
        if(this.amount >= money) {
            this.amount -= money;
            return true;
        }

        return false;
    }

}
