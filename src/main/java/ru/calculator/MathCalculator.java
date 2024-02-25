package ru.calculator;

import ru.math.MathFunction;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static double differenceAndDivide(double first, double second) {
        return MathFunction.difference(first, second)
                + MathFunction.divide(first, second);
    }

    public static double all(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second) + MathFunction.difference(first, second)
                + MathFunction.divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен (1): " + sumAndMultiply(20, 10));
        System.out.println("Результат расчета равен (2): " + differenceAndDivide(20, 10));
        System.out.println("Результат расчета равен (3): " + all(20, 10));
    }
}
