package Типы данных и операторы.Классы-оболочки;

public class 3 {
    public static void main(String[] args) {
        Integer nullInteger = null; // объект-оболочка равен null

        try {
            int value = nullInteger; // ошибка: NullPointerException при unboxing
            System.out.println("Значение: " + value);
        } catch (NullPointerException e) {
            System.out.println("Ошибка: NullPointerException при попытке автораспаковки null!");
        }

        // Автоупаковка НЕ вызывает исключение
        Integer i = 12; // boxing - успешно
        System.out.println("Integer boxing: " + i);
    }
}

