public enum Day {
    MONDAY(true), 
    TUESDAY(true), 
    WEDNESDAY(true), 
    THURSDAY(true), 
    FRIDAY(true), 
    SATURDAY(false), 
    SUNDAY(false);

    private final boolean isWeekday;

    // Конструктор перечисления
    Day(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }

    // Дополнительный метод
    public boolean isWeekday() {
        return isWeekday;
    }

    public String getDayType() {
        return isWeekday ? "Рабочий день" : "Выходной день";
    }
}

public class Main {
    public static void main(String[] args) {
        // Перебор всех элементов перечисления
        for (Day day : Day.values()) {
            System.out.println(day + ": " + day.getDayType());
        }

        // Использование перечисления
        Day today = Day.SATURDAY;
        System.out.println("Сегодня " + today + " -> " + today.getDayType());
    }
}
