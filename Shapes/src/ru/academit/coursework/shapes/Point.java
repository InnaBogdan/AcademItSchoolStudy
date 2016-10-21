package ru.academit.coursework.shapes;

public class Point {

    private double x;
    private double y;

    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calcDistance(Point point) {
        return Math.sqrt(Math.pow(x - point.x, 2)
                + Math.pow(y - point.y, 2));
    }



}