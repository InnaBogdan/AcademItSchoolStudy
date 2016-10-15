package ru.academit.homeworks.range01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите число:");

        Scanner scanner = new Scanner(System.in);
        double userNumber = scanner.nextDouble();

        Range userParameters = new Range(3.099999, 8.8);

        userParameters.isInside(userNumber);

    }
}
