package ru.calculator;

import static ru.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double differenceAndDivide(double first, double second) {
        return difference(first, second)
                + divide(first, second);
    }

    public static double all(double first, double second) {
        return sum(first, second)
                + multiply(first, second) + difference(first, second)
                + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен (1): " + sumAndMultiply(20, 10));
        System.out.println("Результат расчета равен (2): " + differenceAndDivide(20, 10));
        System.out.println("Результат расчета равен (3): " + all(20, 10));
    }
}
