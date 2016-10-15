package ru.academit.homeworks.range01;

public class Range {

    private double from;
    private double to;
    private static final double EPSILON = 0.00000001;

    public Range(double from, double to) {

        this.from = from;
        this.to = to;
    }

    public boolean isInside(double number) {

        if (((Math.abs(number - from) <= EPSILON)||(number > from)) && ((Math.abs(number - to) <= EPSILON)||(number < to))) {
            return true;
        } else {
            return false;
        }
    }
}
