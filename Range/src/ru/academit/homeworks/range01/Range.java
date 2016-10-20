package ru.academit.homeworks.range01;

public class Range {

    private double from;
    private double to;
    private static final double EPSILON = 0.00000001;

    public Range(double from, double to) {

        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }
    public void setFrom(double from) {
        this.from = from;
    }
    public double getTo() {
        return to;
    }
    public void setTo(double to) {
        this.to = to;
    }

    public boolean isInside(double number) {

        if (((Math.abs(number - from) <= EPSILON) || (number > from)) && ((Math.abs(number - to) <= EPSILON) || (number < to))) {
            return true;
        } else {
            return false;
        }
    }

    public double calcDistance(Range range) {
        return to - from;
    }

    public void getCrossInterval(Range range) {
        String s = "";
        String fromString = "";
        String toString = "";
        if (to < range.from) {
            System.out.println("Нет пересечения интервалов");;
        } else {
            if ((range.to < to) && (from < range.from)) {
                fromString = Double.toString(range.from);
                toString = Double.toString(range.to);
                System.out.println(fromString + " " + toString);
            } else if ((range.to > to) && (from < range.from)) {
                fromString = Double.toString(range.from);
                toString = Double.toString(to);
                System.out.println(fromString + " " + toString);
            } else if ((range.to < to) && (from > range.from)) {
                fromString = Double.toString(from);
                toString = Double.toString(range.to);
                System.out.println(fromString + " " + toString);
            } else {
                fromString = Double.toString(from);
                toString = Double.toString(to);
                System.out.println(fromString + " " + toString);
            }
        }
    }

    public void getGeneralInterval(Range range) {
        String s = "";
        String fromString = "";
        String toString = "";
        if (to < range.from) {
            System.out.println("Общий интервал: от" + from + "до" + to + "и от" + range.from + "до" + range.to);;
        } else {
            if ((range.to < to) && (from < range.from)) {
                fromString = Double.toString(from);
                toString = Double.toString(to);
                System.out.println(fromString + " " + toString);
            } else if ((range.to > to) && (from < range.from)) {
                fromString = Double.toString(from);
                toString = Double.toString(range.to);
                System.out.println(fromString + " " + toString);
            } else if ((range.to < to) && (from > range.from)) {
                fromString = Double.toString(range.from);
                toString = Double.toString(to);
                System.out.println(fromString + " " + toString);
            } else {
                fromString = Double.toString(range.from);
                toString = Double.toString(range.to);
                System.out.println(fromString + " " + toString);
            }
        }
    }

    public void getSubtractionInterval(Range range) {
        String s = "";
        String fromString = "";
        String toString = "";
        if (to < range.from) {
            System.out.println("от " + from + " до " + to + " и от " + range.from + " до " + range.to);;
        } else {
            if ((range.to < to) && (from < range.from)) {
                fromString = "от " + Double.toString(from) + " до" + Double.toString(range.from);
                toString = "от " + Double.toString(range.to) + " до" + Double.toString(range.to);
                System.out.println(fromString + "и" + toString);
            } else if ((range.to > to) && (from < range.from)) {
                fromString = "от " + Double.toString(from) + " до" + Double.toString(range.from);
                toString = "от " + Double.toString(to) + " до" + Double.toString(range.to);
                System.out.println(fromString + "и" + toString);
            } else if ((range.to < to) && (from > range.from)) {
                fromString = "от " + Double.toString(range.from) + " до" + Double.toString(from);
                toString = "от " + Double.toString(range.to) + " до" + Double.toString(to);
                System.out.println(fromString + "и" + toString);
            } else if ((Math.abs(range.to - to) <= EPSILON) && (from > range.from)) {
                fromString = "от " + Double.toString(range.from) + " до" + Double.toString(from);
                System.out.println(fromString);
            } else if ((Math.abs(range.to - to) <= EPSILON) && (range.from > from)) {
                fromString = "от " + Double.toString(from) + " до" + Double.toString(range.from);
                System.out.println(fromString);
            } else if ((Math.abs(range.from - from) <= EPSILON) && (range.to > to)) {
                fromString = "от " + Double.toString(to) + " до" + Double.toString(range.to);
                System.out.println(fromString);
            } else if ((Math.abs(range.from - from) <= EPSILON) && (to > range.to)) {
                fromString = "от " + Double.toString(range.from) + " до" + Double.toString(from);
                System.out.println(fromString);
            } else {
                fromString = "от " + Double.toString(range.from) + " до" + Double.toString(from);
                toString = "от " + Double.toString(to) + " до" + Double.toString(range.to);
                System.out.println(fromString + "и" + toString);
            }
        }
    }


}

