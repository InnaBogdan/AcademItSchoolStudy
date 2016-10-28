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

    private static double calcMinMax(double firstNumber, double secondNumber, double thirdNumber) {
        double[] array = {firstNumber, secondNumber, thirdNumber};
        double max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        double min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return max - min;
    }

    public double getWidth() {
        return calcMinMax(x1, x2, x3);
    }

    public double getHeight() {
        return calcMinMax(y1, y2, y3);
    }

    private static double getSide(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    public double getPerimeter() {
        return getSide(x1, y1, x2, y2) + getSide(x2, y2, x3, y3) + getSide(x3, y3, x1, y1);
    }

    public double getArea() {
        return Math.sqrt(getPerimeter() / 2 * (getPerimeter() / 2 - getSide(x1, y1, x2, y2))
                * (getPerimeter() / 2 - getSide(x2, y2, x3, y3)) * (getPerimeter() / 2 - getSide(x3, y3, x1, y1)));
    }
}


