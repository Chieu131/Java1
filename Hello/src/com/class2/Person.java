package com.class2;

import java.util.Scanner;

public class Person {
    String name;
    String email;

    Wallet wallet;

    public Person(String name, String email, int money) {
        this.name = name;
        this.email = email;
        //create a Wallet
        System.out.println("Creating a wallet with money : " + money);
        wallet = new Wallet(money);
    }

    public void depositMoney() {
        System.out.print("Enter money to deposit : ");
        Scanner input = new Scanner(System.in);
        int money = input.nextInt();

        if(money > 0) {
            this.wallet.deposit(money);
        }
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Balace: " + this.wallet.getAmount());
    }

    public int calcTotal (int[] bills) {
        int total = 0;
        for (int i = 0; i < bills.length; i++) {
            total += bills[i];
        }

        return total;
    }

    public boolean payMoney(int total) {
        int balance = wallet.getAmount();

        if(balance >= total) {
            System.out.println("Paid");
            this.wallet.pay(total);

            return true;
        }

        return false;
    }
}
