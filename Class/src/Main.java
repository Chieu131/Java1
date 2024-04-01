package com.class2;

public class Person {
    String name;
    String email;
    Wallet wallet;

    public Person(String name, String email, int money) {
        this.name = name;
        this.email = email;
        //create a Wallet
        wallet = new Wallet(money);
    }
}
