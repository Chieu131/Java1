package com.company;


public class Director extends Person {
    String title;


    //constructor

    public Director() {
        super();
        System.out.println("Creating a director");
    }

    public Director(String name, String email, int salary, String title) {
        super(name, email, salary);
        System.out.println("Creating Director with parameters");
        this.title = title;
    }

    @Override
    public int getBonus() {
        return 5 * this.salary;
    }

    public void thisismethodOfDirector() {
        System.out.println("thisismethodOfDirector");
    }

    @Override
    public void display() {
        System.out.println("This is a Director");
        System.out.println("name " + this.name);
        System.out.println("email " + this.email);
        System.out.println("salary " + this.salary);
    }
}
