package com.class3;

public abstract class Shape {
    String color;
    protected String name;
    protected void getInformation(){
        System.out.println("This is shape info");
    }

    public abstract void display();
}
