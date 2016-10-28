package ru.academit.coursework.shapes;

public class Square implements Shape {

    private double side;

    public Square(double sideSquare) {
        this.side = sideSquare;
    }

    public double getWidth() {
        return side;
    }

    public double getHeight() {
        return side;
    }

    public double getArea() {
        return Math.pow(side, 2);
    }

    public double getPerimeter(){
        return side * 4;
    }
}

