package ru.condition;

public class Max {
    public static int max(int a, int b, int c) {
        return a >= b ? a > c ? a : c : b >= c ? b : c;
    }

    public static void main(String[] args) {
        int rsl = max(3, 2, 1);
        System.out.println(rsl);
    }
}
