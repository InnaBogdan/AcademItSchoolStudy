package ru.academit.homeworks.range01;

import java.util.Scanner;
import java.util.Arrays;

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

        boolean result = userParameters.isInside(userNumber);
        System.out.println(result);

        double lengthInterval = userParameters.calcDistance();
        System.out.println(lengthInterval);
/*
        Range range01 = userFirstInterval.getCrossInterval(userSecondInterval);
        System.out.println(Arrays.toString(range01));*/
        Range[] range02 = userFirstInterval.getGeneralInterval(userSecondInterval);
        System.out.println(Arrays.toString(range02));
        Range[] range03 = userFirstInterval.getSubtractionInterval(userSecondInterval);
        System.out.println(Arrays.toString(range03));
    }
}


