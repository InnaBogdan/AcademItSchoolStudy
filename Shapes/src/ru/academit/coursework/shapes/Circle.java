package ru.academit.coursework.shapes;

public class Circle implements Shapes {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getWidth() {
        return radius;
    }

    public double getHeight() {
        return radius;
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
}

