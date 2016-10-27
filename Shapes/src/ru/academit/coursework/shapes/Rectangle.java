package ru.academit.coursework.shapes;

public class Rectangle implements Shapes{

    private double firstSide;
    private double secondSide;

    public Rectangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public double getWidth() {
        return firstSide;
    }

    public double getHeight() {
        return secondSide;
    }

    public double getArea() {
        return firstSide * secondSide;
    }

    public double getPerimeter(){
        return 2 * (firstSide + secondSide);
    }
}

