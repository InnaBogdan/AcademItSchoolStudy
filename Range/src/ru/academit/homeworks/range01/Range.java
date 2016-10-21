package ru.academit.homeworks.range01;

public class Range {

    private double from;
    private double to;
    private static final double EPSILON = 0.00000001;
    private double minFrom;
    private double maxFrom;
    private double minTo;
    private double maxTo;

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
/*
    public double calcDistance(Range range) {
        return to - from;
    }*/

    private void getMinMax(Range range) {
        if (to < range.to) {
            minTo = to;
            maxTo = range.to;
        } else {
            maxTo = to;
            minTo = range.to;
        }
        if (from < range.from) {
            minFrom = from;
            maxFrom = range.from;
        } else {
            maxFrom = from;
            minFrom = range.from;
        }
    }

    public Range getCrossInterval(Range range) {

        getMinMax(range);

        if (minTo < maxFrom) {
            return null;
        } else {
            return new Range(maxFrom, minTo);
        }
    }

    public Range [] getGeneralInterval(Range range) {
        getMinMax(range);

        if (minTo < maxFrom) {
            return new Range [] {new Range(minFrom, minTo), new Range(maxFrom, maxTo)};
        } else {
            return new Range [] {new Range(minFrom, maxTo)};
        }
    }

    public Range [] getSubtractionInterval(Range range) {
        getMinMax(range);

        if (minTo < maxFrom) {
            return new Range [] {new Range(minFrom, minTo), new Range(maxFrom, maxTo)};

        } else if (Math.abs(maxTo - minTo) <= EPSILON) {
            return new Range [] {new Range(minFrom, maxFrom)};
        } else if (Math.abs(maxFrom - minFrom) <= EPSILON) {
            return new Range [] {new Range(minTo, maxTo)};
        } else {
            return new Range [] {new Range(minFrom, maxFrom), new Range(minTo, maxTo)};
        }
    }
}

