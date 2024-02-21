package ru.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 100;
    }

    public static float rubleToDollar(float value) {
        return value / 90;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 1.4f;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 1.4. Test result : " + passed);
        float in1 = 90;
        float expected1 = 1.0f;
        float out1 = Converter.rubleToDollar(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("90 rubles are 1.0. Test result : " + passed1);
    }
}

