package ru.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        int[] massivZero = new int [0];
        int[] massiv = new int [2];
        int k = 0;
        while (i < j) {
            if (array[i] + array[j] > target) {
                j--;
            }
            if (array[i] + array[j] < target) {
                j = array.length - 1;
                i++;
            }
            if (array[i] + array[j] == target) {
                massiv[0] = i;
                massiv[1] = j;
                k = 1;
                break;
            }
        }
        if (k == 1) {
            return massiv;
        } else {
            return massivZero;
        }
    }
}

