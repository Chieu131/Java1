package com.company;

//abstract Person
public abstract class Person {
    String name;
    String email;
    int salary;

    public Person() {
        System.out.println("Creating a Person");
    }

    public Person(String name, String email, int salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
        System.out.println("Creating Person with parameters");
    }

    public void personMethod() {
        System.out.println("personMethod");
    }

    public abstract int getBonus();
    //public abstract void input();
    public abstract void display();

}

