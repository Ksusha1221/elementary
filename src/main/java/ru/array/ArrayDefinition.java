package ru.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println(ages.length);
        System.out.println(surnames.length);
        System.out.println(prices.length);
        String[] names = new String[4];
        names[0] = "Ivan Ivanov1";
        names[1] = "Ivan Ivanov2";
        names[2] = "Ivan Ivanov3";
        names[3] = "Ivan Ivanov4";
        System.out.println(names[0] + " " + names[1] + " " + names[2] + " " + names[3]);
    }
}
