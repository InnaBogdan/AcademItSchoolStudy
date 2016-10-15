package ru.academit.homeworks.range;

public class Range {

    private double from;
    private double to;
    private double number;

    public Range(double number, double from, double to) {
        this.number = number;
        this.from = from;
        this.to = to;
    }

    public void isInside() {

        final double EPSILON = 0.00000001;

        if (((Math.abs(number - from) <= EPSILON)||(number > from)) && ((Math.abs(number - from) <= EPSILON)||(number < to))) {
            System.out.println("Число принадлежит интервалу");
        } else {
            System.out.println("Число не принадлежит интервалу");
        }
    }
}
