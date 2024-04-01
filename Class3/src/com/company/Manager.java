package com.company;

public class Manager extends Person {
    String skill;

    public Manager(String name, String email, int salary, String skill) {
        super(name, email, salary);
        this.skill = skill;
    }

    @Override
    public int getBonus() {
        return 3 * this.salary;
    }

    @Override
    public void display() {
        System.out.println("This is a Manager");
        System.out.println("name " + this.name);
        System.out.println("email " + this.email);
        System.out.println("salary " + this.salary);
    }
}
