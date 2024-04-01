package com.class3;

public class Rectangle extends Shape {
    float length;
    float width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getArea() {
        return this.length * this.width;
    }

    @Override
    public void display() {
        System.out.println("Length " + this.length);
        System.out.println("Width " + this.width);
        System.out.println("Color " + this.color);
    }
}
