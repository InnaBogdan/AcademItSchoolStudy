package ru.academit.coursework.shapes;

public class Rectangle {

    private double firstSideRectangle;
    private double secondSideRectangle;

    public Rectangle(double firstSideRectangle, double secondSideRectangle) {
        this.firstSideRectangle = firstSideRectangle;
        this.secondSideRectangle = secondSideRectangle;
    }

    public double getWidthRectangle() {
        return firstSideRectangle;
    }

    public double getHeightRectangle() {
        return secondSideRectangle;
    }

    public double getAreaRectangle() {
        return firstSideRectangle * secondSideRectangle;
    }

    public double getPerimeterRectangle(){
        return 2 * (firstSideRectangle + secondSideRectangle);
    }
}
