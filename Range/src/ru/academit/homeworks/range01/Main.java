package ru.academit.homeworks.range01;

import java.util.Scanner;

public class Main {

    private Range firstInterval;
    private Range secondInterval;

    public Main(double from1, double from2, double to1, double to2) {
        firstInterval = new Range(from1, to1);
        secondInterval = new Range(from2, to2);
    }

    public Range getFirstInterval() {
        return firstInterval;
    }

    public Range getSecondInterval() {
        return secondInterval;
    }

    public static void main(String[] args) {

        System.out.println("Введите число:");

        Scanner scanner = new Scanner(System.in);
        double userNumber = scanner.nextDouble();

        Range userParameters = new Range(3.099999, 8.8);
        Range userFirstInterval = new Range(3, 7);
        Range userSecondInterval = new Range(2, 6);

        userParameters.isInside(userNumber);

        userFirstInterval.getCrossInterval(userSecondInterval);
        userFirstInterval.getGeneralInterval(userSecondInterval);
        userFirstInterval.getSubtractionInterval(userSecondInterval);

    }
}

