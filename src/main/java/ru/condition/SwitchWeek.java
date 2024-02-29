package ru.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        return switch (day) {
            case 1 -> "ПН";
            case 2 -> "ВТ";
            case 3 -> "СР";
            case 4 -> "ЧТ";
            case 5 -> "ПТ";
            case 6 -> "СБ";
            case 7 -> "ВС";
            default -> "Печалька(";
        };
    }
}

