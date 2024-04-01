package com.class3;

public class Circle extends Shape {
    float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public Circle(float radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void display() {
        System.out.println("Radius: " + this.radius);
        System.out.println("Color " + this.color);
    }

    public float getArea() {
        return (float)(Math.PI * this.radius * this.radius);
    }
}
