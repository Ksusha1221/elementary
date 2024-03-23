package ru.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int sdacha = money - price;
        for (int i = size; i < coins.length; i++) {
            while (sdacha > 0 && sdacha - coins[i] >= 0) {
                rsl[size] = coins[i];
                sdacha -= coins[i];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}

