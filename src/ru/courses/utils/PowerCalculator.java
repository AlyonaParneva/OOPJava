package ru.courses.utils;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class PowerCalculator {
    public static double calculate(String x, String y) {
        int base = parseInt(x);
        int exponent = parseInt(y);
        return pow(base, exponent);
    }
}
