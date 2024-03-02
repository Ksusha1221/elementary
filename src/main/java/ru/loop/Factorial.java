package ru.loop;

public class Factorial {
    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static int calc(int n) {
        int rsl = 0;
        if (n == 0 || n == 1) {
            rsl = 1;
        } else if (n > 0){
            rsl = 1;
            for (int i = 1; i <= n; i++) {
                rsl *= i;
            }
        }
        return rsl;
    }
}
