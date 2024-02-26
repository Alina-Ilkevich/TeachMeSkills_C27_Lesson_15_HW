package com.teachmeskills.lesson15.task2.figure;

/**
 * This class is used to describe a circle and
 * describe methods for calculating the perimeter and area of the circle
 */
public class Circle extends Figure {

    public Circle(int side1) {
        super(side1);
    }
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * side1;
    }
}
