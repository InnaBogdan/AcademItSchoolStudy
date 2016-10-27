package ru.academit.coursework.shapes;

public class Triangle implements Shapes{

    private double x1;
    private double x2;
    private double x3;
    private double y1;
    private double y2;
    private double y3;

    public Triangle(double x1, double x2, double x3, double y1, double y2, double y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    private double getMaxX() {
        double[] arrayX = {x1, x2, x3};
        double maxX = arrayX[0];

        for (int i = 0; i != arrayX.length; i++) {
            if (arrayX[i] > maxX) {
                maxX = arrayX[i];
            }
        }
        return maxX;
    }

    private double getMinX() {
        double[] arrayX = {x1, x2, x3};
        double minX = arrayX[0];

        for (int i = 0; i != arrayX.length; i++) {
            if (arrayX[i] < minX) {
                minX = arrayX[i];
            }
        }
        return minX;
    }

    private double getMaxY() {
        double[] arrayY = {y1, y2, y3};
        double maxY = arrayY[0];

        for (int i = 0; i != arrayY.length; i++) {
            if (arrayY[i] > maxY) {
                maxY = arrayY[i];
            }
        }
        return maxY;
    }

    private double getMinY() {
        double[] arrayY = {y1, y2, y3};
        double minY = arrayY[0];

        for (int i = 0; i != arrayY.length; i++) {
            if (arrayY[i] < minY) {
                minY = arrayY[i];
            }
        }
        return minY;
    }

    public double getWidth() {
        return getMaxX() - getMinX();
    }

    public double getHeight() {
        return getMaxY() - getMinY();
    }

    public double getPerimeter() {
        double perimeter = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) +
                Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2) + Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        return perimeter;
    }

    public double getArea() {
        double firstSide = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        double secondSide = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double thirdSide = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        double halfPerimeter = (firstSide + secondSide + thirdSide) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - firstSide) * (halfPerimeter - secondSide) * (halfPerimeter - thirdSide));
    }
}


