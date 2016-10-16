package ru.academit.coursework.shapes;

public class Triangle {

    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point first, Point second, Point third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }



    public double getPerimeter() {
        double halfPerimeter = second.calcDistance(first) + third.calcDistance(second) + first.calcDistance(third);
        return halfPerimeter;
    }


}

