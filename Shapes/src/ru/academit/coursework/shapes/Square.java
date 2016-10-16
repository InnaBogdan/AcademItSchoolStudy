package ru.academit.coursework.shapes;

public class Square {

    private double sideSquare;

    public Square(double sideSquare) {
        this.sideSquare = sideSquare;
    }

    public double getWidth() {
        return sideSquare;
    }

    public double getHeight() {
        return sideSquare;
    }

    public double getArea() {
        return Math.pow(sideSquare, 2);
    }

    public double getPerimeter(){
        return sideSquare * 4;
    }
}
