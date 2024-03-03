package com.teachmeskills.lesson15.task2.run;
import com.teachmeskills.lesson15.task2.figure.*;

import java.util.ArrayList;

/**
 *  This class is used to create class objects and add them to the collection
 */
public class Runner {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(2, 4, 5, 6);
        Rectangle rectangle1 = new Rectangle(5, 8);
        Triangle triangle2 = new Triangle(9, 3, 4, 1);
        Circle circle1 = new Circle(5);
        Rectangle rectangle2 = new Rectangle(9, 2);
        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(triangle1);
        figures.add(rectangle1);
        figures.add(triangle2);
        figures.add(circle1);
        figures.add(rectangle2);
        for (Figure fig : figures) {
            System.out.println("Perimeter: " + fig.calculatePerimeter());
        }
    }
}
