package ru.academit.coursework.shapes;

public class Main {

    private static String getMaxArea(String[] objects, double... elements) {
        double max = elements[0];

        for (int i = 1; i < elements.length; i++) {
            if (elements[i] > max) {
                max = elements[i];
            }
        }
        int indexMax = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == max) {
                indexMax = i;
            }
        }
        return "Фигура " + objects[indexMax] + System.lineSeparator() + "Площадь = " + max;
    }
/*
    private static String getSecondMaxPerimeter(String[] objects, double... elements) {
        double [] sortElements = Array.sort(double... elements);

        for (int i = 1; i < elements.length; i++) {
            if (elements[i] > max) {
                max = elements[i];
            }
        }
        int indexMax = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == max) {
                indexMax = i;
            }
        }
        return "Фигура " + objects[indexMax] + System.lineSeparator() + "Площадь = " + max;
    }
*/
    public static void main(String[] args) {
        Shape shape01 = new Circle(2);
        Shape shape02 = new Rectangle(7, 3);
        Shape shape03 = new Triangle(1, 2, 3, 4, 5, 6);
        Shape shape04 = new Square(4);
        Shape shape05 = new Square(3);
        Shape shape06 = new Rectangle(4, 5);
        Shape shape07 = new Circle(0.5);
        Shape shape08 = new Triangle(1, 5, 8, -1, 7, 0);

        String[] object = {"shape01", "shape02", "shape03", "shape04",
                "shape05", "shape06", "shape07", "shape08"};

        double[] arrayArea = {shape01.getArea(), shape02.getArea(), shape03.getArea(), shape04.getArea(),
                shape05.getArea(), shape06.getArea(), shape07.getArea(), shape08.getArea()};

        double[] arrayPerimeter = {shape01.getPerimeter(), shape02.getPerimeter(), shape03.getPerimeter(), shape04.getPerimeter(),
                shape05.getPerimeter(), shape06.getPerimeter(), shape07.getPerimeter(), shape08.getPerimeter()};

        String result = getMaxArea(object, arrayArea);
        System.out.println(result);
    }
}


