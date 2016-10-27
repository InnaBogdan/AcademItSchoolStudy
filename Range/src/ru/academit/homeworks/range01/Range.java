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

    public double getTo() {
        return to;
    }

    public boolean isInside(double number) {
        return (((Math.abs(number - from) <= EPSILON) || (number > from)) && ((Math.abs(number - to) <= EPSILON) || (number < to)));
    }

    public double calcDistance() {
        return to - from;
    }

    public Range getCrossInterval(Range range) {
        if (Math.min(to, range.to) < Math.max(from, range.from)) {
            return null;
        } else {
            return new Range(Math.max(from, range.from), Math.min(to, range.to));
        }
    }

    public Range[] getGeneralInterval(Range range) {
        if (Math.min(to, range.to) < Math.max(from, range.from)) {
            return new Range[]{new Range(Math.min(from, range.from), Math.min(to, range.to)), new Range(Math.max(from, range.from), Math.max(to, range.to))};
        } else {
            return new Range[]{new Range(Math.min(from, range.from), Math.max(to, range.to))};
        }
    }

    public Range[] getSubtractionInterval(Range range) {
        if (to < range.from) {
            return new Range[]{new Range(from, to)};
        } else if ((((Math.abs(from - range.from) <= EPSILON) || (range.from < from)) && (to < range.to)) || (range.to < from)) {
            return new Range[]{null};
        } else if (((Math.abs(from - range.from) <= EPSILON) || (range.from < from)) && (range.to < to)) {
            return new Range[]{new Range(range.to, to)};
        } else if ((from < range.from) && (range.to < to)) {
            return new Range[]{new Range(from, range.from), new Range(range.to, to)};
        } else {
            return new Range[]{new Range(from, range.from)};
        }
    }
}

