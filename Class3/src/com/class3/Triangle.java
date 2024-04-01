package com.class3;

public class Triangle extends Shape {
    float a;
    float b;
    float c;

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(float a, float b, float c, String color) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = color;
    }

    public float getArea() {
        float p = (a + b + c) / 2;

        //square root
        return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public void display() {
        System.out.println("A = " + this.a);
        System.out.println("B = " + this.b);
        System.out.println("C = " + this.c);
        System.out.println("Color = " + this.color);
    }
}
