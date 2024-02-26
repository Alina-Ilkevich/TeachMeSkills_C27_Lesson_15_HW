package com.teachmeskills.lesson15.task2.figure;

import com.teachmeskills.lesson15.task2.figure.Figure;

/**
 * This class is used to describe a circle and
describe methods for calculating the perimeter and area of the triangle
 */
public class Triangle extends Figure {

    int h;
    int side2;
    int side3;
    public Triangle(int side1, int h, int side2, int side3) {
        super(side1);
        this.h = h;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
