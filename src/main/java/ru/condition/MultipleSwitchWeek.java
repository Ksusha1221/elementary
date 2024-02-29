package ru.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "ПН", "Monday" -> 1;
            case "ВТ", "Tuesday" -> 2;
            case "СР", "Wednesday" -> 3;
            case "ЧТ", "Thursday" -> 4;
            case "ПТ", "Friday" -> 5;
            case "СБ", "Saturday" -> 6;
            case "ВС", "Sunday" -> 7;
            default -> -1;
        };
    }
}

