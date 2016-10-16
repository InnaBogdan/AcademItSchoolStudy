package ru.academit.coursework.shapes;

public class Circle {
    private double radiusCircle;

    public Circle(double radiusCircle) {
        this.radiusCircle = radiusCircle;
    }

    public double getWidthCircle() {
        return radiusCircle;
    }

    public double getHeightCircle() {
        return radiusCircle;
    }

    public double getAreaCircle() {
        return Math.pow(radiusCircle, 2) * Math.PI;
    }

    public double getPerimeterCircle(){
        return 2 * Math.PI * radiusCircle;
    }
}
