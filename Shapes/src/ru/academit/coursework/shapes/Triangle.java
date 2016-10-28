package ru.academit.coursework.shapes;

public class Triangle implements Shape {

    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    private double calcMinMaxX(double x1, double x2, double x3) {
        double[] arrayX = {x1, x2, x3};
        double maxX = arrayX[0];

        for (int i = 1; i < arrayX.length; i++) {
            if (arrayX[i] > maxX) {
                maxX = arrayX[i];
            }
        }

        double minX = arrayX[0];

        for (int i = 1; i < arrayX.length; i++) {
            if (arrayX[i] < minX) {
                minX = arrayX[i];
            }
        }
        return maxX - minX;
    }

    private double calcMinMaxY(double y1, double y2, double y3) {
        double[] arrayY = {y1, y2, y3};
        double maxY = arrayY[0];

        for (int i = 1; i < arrayY.length; i++) {
            if (arrayY[i] > maxY) {
                maxY = arrayY[i];
            }
        }

        double minY = arrayY[0];

        for (int i = 1; i < arrayY.length; i++) {
            if (arrayY[i] < minY) {
                minY = arrayY[i];
            }
        }
        return maxY - minY;
    }

    public double getWidth() {
        return calcMinMaxX(x1, x2, x3);
    }

    public double getHeight() {
        return calcMinMaxY(y1, y2, y3);
    }

    private double getSide(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    public double getPerimeter() {
        return getSide(x1, y1, x2, y2) + getSide(x2, y2, x3, y3) + getSide(x3, y3, x1, y1);
    }

    public double getArea() {
        double halfPerimeter = (getSide(x1, y1, x2, y2) + getSide(x2, y2, x3, y3) + getSide(x3, y3, x1, y1)) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - getSide(x1, y1, x2, y2))
                * (halfPerimeter - getSide(x2, y2, x3, y3)) * (halfPerimeter - getSide(x3, y3, x1, y1)));
    }
}


