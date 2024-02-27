package ru.condition;

public class Max {
    public static int max2(int a, int b) {
        return a > b ? a : b;
    }

    public static int max3(int a, int b, int c) {
        int firstMax = max2(a, b);
        return max2(firstMax, c);
    }

    public static void main(String[] args) {
        int rsl = max3(1, 2, 3);
        System.out.println(rsl);
    }
}
