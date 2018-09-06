package com.ucbcba;

public class Circle implements Figure {
    double radius;
    double pi=3.14;
    Circle(double radius) {    this.radius = radius;  }

    @Override
    public double perimenter() {
        return pi*2*radius;
    }

    @Override
    public double area() {
        return pi*(radius*radius); //TODO
    }

    @Override
    public void draw() {
        //TODO implementar draw de circle
    }
}
