package com.company;

public class Employee extends Person {

    int level;

    public Employee(String name, String email, int salary, int level) {
        super(name, email, salary);
        this.level = level;
    }

    @Override
    public int getBonus() {
        return 2 * this.salary;
    }

    @Override
    public void display() {
        System.out.println("This is a Employee");
        System.out.println("name " + this.name);
        System.out.println("email " + this.email);
        System.out.println("salary " + this.salary);
    }
}
