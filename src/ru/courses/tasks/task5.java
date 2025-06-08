package ru.courses.tasks;

import ru.courses.utils.PowerCalculator;

import java.util.Scanner;

public class task5 {
    public static void runTask5() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите основание X: ");
        String x = scanner.nextLine();

        System.out.print("Введите показатель Y: ");
        String y = scanner.nextLine();

        double result = PowerCalculator.calculate(x, y);
        System.out.printf("%s в степени %s = %.2f%n", x, y, result);
    }
}
