package com.teachmeskills.lesson15.task2.figure;

/**
 * This abstract class is used to create a common characteristic of all shapes
 * and add a method to find the perimeter of the shapes
 */
public abstract class Figure {

    int side1;
    public Figure(int side1) {
        this.side1 = side1;
    }
    public abstract double calculatePerimeter();
}
