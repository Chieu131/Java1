package com.class3;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
//        Circle circle = new Circle(5, "Red");
//
//        circle.display();
        List<Shape> list = new ArrayList<Shape>();
            list.add(new Circle(5));
            list.add(new Rectangle(3,4));
            list.add(new Triangle(4,5,6));

        float area = 0;
        for (Shape item : list) {
            area += item.getArea();
        }

        System.out.println("Total area: " + area);



    }
}


