public enum Season {
    WINTER("Холодно"), 
    SPRING("Тепло"), 
    SUMMER("Жарко"), 
    AUTUMN("Прохладно");

    private final String description;

    // Конструктор перечисления
    Season(String description) {
        this.description = description;
    }

    // Метод для получения описания
    public String getDescription() {
        return description;
    }
}

public class Main {
    public static void main(String[] args) {
        // Инициализация перечисления
        Season season = Season.SUMMER;

        // Использование перечисления
        System.out.println("Текущий сезон: " + season);
        System.out.println("Описание: " + season.getDescription());

        // Перебор всех элементов перечисления
        for (Season s : Season.values()) {
            System.out.println(s + " -> " + s.getDescription());
        }
    }
}
